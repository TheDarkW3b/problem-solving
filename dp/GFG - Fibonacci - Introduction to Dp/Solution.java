class Solution {
    public static final int MOD = 1000000007;

    public static int fibo(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = (fibo(n - 1, dp) + fibo(n - 2, dp)) % MOD;
    }

    public static long topDown(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return fibo(n, dp);
    }

    public static long bottomUp(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        return dp[n];
    }
}
