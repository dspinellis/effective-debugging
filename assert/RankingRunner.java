class RankingRunner {
    public static void main(String[] args) {
        int t[] = new int[5];

        t[0] = 4;
        t[1] = -4;
        t[2] = 145;
        t[3] = 0;
        t[4] = Integer.MIN_VALUE;
        System.out.println("The maximum value is " + Ranking.findMax(t));
    }
}
