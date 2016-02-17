class Ranking {
    /** Return the maximum number in non-empty array v */
    public static int findMax(int[] v) {
        int max = Integer.MIN_VALUE;

        // Precondition: v[] is not empty
        assert v.length > 0 : "v[] is empty";

        // Precondition: max <= v[i] for every i
        for (int n : v)
            assert max <= n : "Found value < MIN_VALUE";

        // Obtain the actual maximum value
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max)
                max = v[i];
            // Invariant: max >= v[j] for every j <= i
            for (int j = 0; j <= i; j++)
                assert max >= v[j] : "Found value > max";
        }

        // Postcondition: max >= v[i] for every i
        for (int n : v)
            assert max >= n : "Found value > max";
        return max;
    }
}
