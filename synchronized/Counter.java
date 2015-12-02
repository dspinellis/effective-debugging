class Counter {
    private int n = 0;

    public synchronized void increment() {
        n++;
    }

    public void decrement() {
        n--;
    }

    public synchronized int value() {
        return n;
    }
}
