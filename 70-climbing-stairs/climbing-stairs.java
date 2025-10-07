class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return jump(n, dp);
    }

    int jump(int n, int[] dp) {
        if (n == 0 || n == 1) return 1;

        if (dp[n] != 0) return dp[n];

        dp[n] = jump(n - 1, dp) + jump(n - 2, dp);
        return dp[n];
    }
}