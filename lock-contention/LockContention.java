import java.security.*;
import java.util.concurrent.*;

public class LockContention {
    static public void main(String args[]) {
        int nThreads = Integer.parseInt(args[0]);
        int nTasks = Integer.parseInt(args[1]);

        Runnable task = () -> {
            try {
                KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");

                SecureRandom random = SecureRandom.getInstanceStrong();
                keyGen.initialize(2048, random);
                KeyPair pair = keyGen.generateKeyPair();
            } catch (Exception e) {
              System.out.println("Generation failed: " + e);
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(nThreads);
        for (int i = 0; i < nTasks; i++)
            executor.submit(task);
        try {
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("Interrupted await: " + e);
        }
    }
}
