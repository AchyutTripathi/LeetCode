class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        boolean[][] dp = new boolean[n][n + 1];
        dp[0][0] = true;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int nextJump = stones[i] - stones[j];

                if (nextJump <= 0 || nextJump >= n) continue;

                if (dp[j][nextJump - 1] || dp[j][nextJump] || dp[j][nextJump + 1]) {
                    dp[i][nextJump] = true;

                    if (i == n - 1) return true;
                }
            }
        }
        return false;
    }
}