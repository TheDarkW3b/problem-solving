class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        return uniquePaths(m - 1, n - 1, dp);
    }

    private int uniquePaths(int m, int n, int[][] dp) {
        if (m == 0 && n == 0) {
            return 1;
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        int up = 0;
        if (m - 1 >= 0) {
            up = uniquePaths(m - 1, n, dp);
        }

        int left = 0;
        if (n - 1 >= 0) {
            left = uniquePaths(m, n - 1, dp);
        }

        return dp[m][n] = up + left;
    }
}
