class ModTest {
    /** Return an angle normalized in the 0-2 PI range */
    static double normalizeAngle(double angle) {
        return angle - 2 * Math.PI * Math.floor(angle / 2 / Math.PI);
    }

    /** Return true the difference between a and b is negligible */
    static boolean almostEqual(double a, double b) {
        return Math.abs(a - b) < (a + b) / 1e10;
    }

    public static void main(String[] args) {
        assert almostEqual(normalizeAngle(0.1), 0.1);
        assert almostEqual(normalizeAngle(Math.PI), Math.PI);
        assert almostEqual(normalizeAngle(0.1 + 2 * Math.PI), 0.1);
        assert almostEqual(normalizeAngle(0.1 + 6 * Math.PI), 0.1);
        assert almostEqual(normalizeAngle(-1), 2 * Math.PI - 1);
    }
}
