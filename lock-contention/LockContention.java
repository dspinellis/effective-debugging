import java.util.Random;

public class LockContention {
    static Random randomGen = new Random();
    static int NTHREAD = 7;
    static Object lock = new Object();
    static int counter = 0;

    static public void main(String args[]) {
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++)
                synchronized (lock) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        System.err.println("Interrupted sleep: " + e);
                    }
                    counter++;
                }
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
            System.err.println("Interrupted join: " + e);
        }
    }
}
