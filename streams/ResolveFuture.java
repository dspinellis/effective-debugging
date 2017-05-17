import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.List;

/** Resolve IP addressed in file args[0] using 100 threads */
public class ResolveFuture {
    /** Resolve the passed internet address into a name */
    static String addressName(String ipAddress) {
        try {
            return InetAddress.getByName(ipAddress).getHostName();
        } catch (UnknownHostException e) {
            return ipAddress;
        }
    }

    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
        // Create pool of 100 threads to compute results
        ForkJoinPool fjp = new ForkJoinPool(100);

        try {
            // Obtain list of lines
            List<CompletableFuture<String>> list = 
                Files.lines(path)
                // Map lines into a future task
                .map(line -> CompletableFuture.supplyAsync(
                            () -> addressName(line), fjp))
                // Collect future tasks into a list
                .collect(Collectors.toList());
            // Wait for tasks to complete, and print the result
            list.stream().map(CompletableFuture::join)
                .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Failed: " + e);
        }
    }
}
