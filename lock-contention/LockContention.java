import java.security.*;
import java.util.concurrent.*;
import java.util.HashMap;

public class LockContention {
    static public void main(String[] args) {
        int nKeys = Integer.parseInt(args[0]);
        int nThreads = Integer.parseInt(args[1]);
        HashMap<PublicKey, PrivateKey> map = 
            new HashMap<PublicKey,
            PrivateKey>();

        Runnable task = () -> {
            try {
                synchronized(map) {
                    KeyPairGenerator keyGen = KeyPairGenerator
                        .getInstance("DSA", "SUN");
                    SecureRandom random = SecureRandom
                        .getInstanceStrong();
                    keyGen.initialize(2048, random);
                    KeyPair pair = keyGen.generateKeyPair();
                    map.put(pair.getPublic(), pair.getPrivate());
                }
            } catch (Exception e) {
              System.out.println("Generation failed: " + e);
            }
        };

        ExecutorService executor = Executors
            .newFixedThreadPool(nThreads);
        for (int i = 0; i < nKeys; i++)
            executor.submit(task);
        try {
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("Interrupted await: " + e);
        }
    }
}
