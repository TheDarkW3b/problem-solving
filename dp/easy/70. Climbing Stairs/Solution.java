class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return climb(n, dp);
    }

    private int climb(int n, int[] dp) {
        if (n <= 1) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = climb(n - 1, dp) + climb(n - 2, dp);
    }
}
