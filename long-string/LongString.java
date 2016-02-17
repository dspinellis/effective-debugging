class LongString {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 100000; i++)
            // s = new StringBuilder().append(s).append(" ").toString();
            s += " ";
    }
}
