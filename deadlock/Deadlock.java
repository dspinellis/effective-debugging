public class Deadlock {
    public static void main(String[] args) {
        Object mutex1 = new Object();
        Object mutex2 = new Object();

        Runnable bob = () -> {
            for (int i = 0; i < 1000; i++)
                synchronized(mutex1) {
                    synchronized(mutex2) {
                        System.out.println("Hi, it's Bob " + i);
                    }
                }
        };
        Runnable alice = () -> {
            for (int i = 0; i < 1000; i++)
                synchronized(mutex2) {
                    synchronized(mutex1) {
                        System.out.println("Hi, it's Alice " + i);
                    }
                }
        };

        Thread at = new Thread(alice);
        Thread bt = new Thread(bob);

        bt.start();
        at.start();

        try {
            at.join();
            bt.join();
        } catch(InterruptedException e) {
            System.err.println("Interrupted: " + e);
        }
    }
}
