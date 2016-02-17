class ExerciseCounter {
    public static void main(String[] args) {
        final Counter c = new Counter();
        final int ITERATIONS = 100000;

        Thread inc = new Thread() {
            public void run() {
                for (int i = 0; i < ITERATIONS; i++)
                    c.increment();
          }
        };

        Thread dec = new Thread() {
            public void run() {
                for (int i = 0; i < ITERATIONS; i++)
                    c.decrement();
          }
        };

        inc.start();
        dec.start();
        try {
            inc.join();
            dec.join();
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println(c.value());
    }
}
