class SpinWait {
    /** A field to test */
    private boolean ready;

    /** A method busy waiting on the field */
    public void waitForReady() {
        /*
         * THIS IS WRONG:
         * The compiler is allowed to hoist the field read out of the loop,
         * making the loop infinite.
         */
        while (!ready)
            ;
    }
}
