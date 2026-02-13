// class Solution {
//     public int minInsertions(String s) {
//         return helper(s, 0, s.length() - 1);
//     }

//     private int helper(String s, int left, int right) {
//         if (left >= right) {
//             return 0;
//         }
//         if (s.charAt(left) == s.charAt(right)) {
//             return helper(s, left + 1, right - 1);
//         }
//         return 1 + Math.min(
//                 helper(s, left + 1, right),
//                 helper(s, left, right - 1)
//         );
//     }
// }




// Memo
// class Solution {
//     public int minInsertions(String s) {
//         int n = s.length();
//         int[][] dp = new int[n][n];
//         return solve(s, 0, n - 1, dp);
//     }

//     private int solve(String s, int left, int right, int[][] dp) {
//         if (left >= right) {
//             return 0;
//         }
//         if (dp[left][right] != 0) {
//             return dp[left][right];
//         }
//         if (s.charAt(left) == s.charAt(right)) {
//             dp[left][right] = solve(s, left + 1, right - 1, dp);
//         } 
//         else {
//             dp[left][right] = 1 + Math.min(
//                     solve(s, left + 1, right, dp),
//                     solve(s, left, right - 1, dp)
//             );
//         } 
//         return dp[left][right];
//     }
// }


// Build LCS table
class Solution {
    public int minInsertions(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int lps = dp[n][n];
        return n - lps;
    }
}
