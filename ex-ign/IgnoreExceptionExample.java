class IgnoreExceptionExample {

    public void readData(java.io.InputStream is) {
        try {
            is.read();
        } catch (java.io.IOException ex) {}
    }
}
