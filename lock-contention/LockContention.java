import java.util.Random;

public class LockContention {
    static Random randomGen = new Random();
    static int NTHREAD = 100;

    static public void main(String args[]) {
        Runnable task = () -> {
            for (int i = 0; i < 10000000; i++)
                randomGen.nextInt(1000);
        };

        Thread threads[] = new Thread[NTHREAD];
        for (int i = 0; i < NTHREAD; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }
        try {
            for (Thread t : threads)
                t.join();
        } catch (InterruptedException e) {
            System.err.println("Interrupted: " + e);
        }
    }
}
