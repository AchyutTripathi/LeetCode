// class Solution {
//     public int minScoreTriangulation(int[] values) {
//         return solve(values, 0, values.length - 1);
//     }

//     private int solve(int[] values, int i, int j) {
//         if (j - i < 2) return 0;
//         int ans = Integer.MAX_VALUE;
//         for (int k = i + 1; k < j; k++) {
//             int left = solve(values, i, k);
//             int right = solve(values, k, j);
//             int score = left + right + values[i] * values[j] * values[k];
//             ans = Math.min(ans, score);
//         }
//         return ans;
//     } 
// }



class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];
        return solve(values, 0, values.length - 1, dp);
    }

    private int solve(int[] values, int i, int j, int[][] dp) {
        if (j - i < 2) return 0;
        if (dp[i][j] != 0) return dp[i][j];
        int ans = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            int left = solve(values, i, k, dp);
            int right = solve(values, k, j, dp);
            int score = left + right + values[i] * values[j] * values[k];
            ans = Math.min(ans, score);
        }
        dp[i][j] = ans;
        return ans;
    } 
}



