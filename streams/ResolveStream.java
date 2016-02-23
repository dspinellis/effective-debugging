import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** Resolve IP addresses in file args[0] */
public class ResolveStream {
    /** Resolve the passed IP address into a name */
    static String addressName(String ipAddress) {
        try {
            return InetAddress.getByName(ipAddress).getHostName();
        } catch (UnknownHostException e) {
            return ipAddress;
        }
    }

    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
        try {
            Files.lines(path)
            .parallel()
            .map(line -> addressName(line))
            .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Failed: " + e);
        }
    }
}
