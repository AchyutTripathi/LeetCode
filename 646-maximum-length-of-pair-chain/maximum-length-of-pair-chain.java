class Solution {
    int[] dp;
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        int n = pairs.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, solve(pairs, i));
        }
        return ans;
    }

    private int solve(int[][] pairs, int i) {
        if (dp[i] != -1) return dp[i];
        int n = pairs.length;
        int max = 1;
        for (int j = i + 1; j < n; j++) {
            if (pairs[i][1] < pairs[j][0]) {
                max = Math.max(max, 1 + solve(pairs, j));
            }
        }
        return dp[i] = max;
    }
}
