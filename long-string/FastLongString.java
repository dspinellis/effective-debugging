class FastLongString {
    public static void main(String[] args) {
        String s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++)
            sb.append(" ");
        s = sb.toString();
    }
}
