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





class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        Integer[][] dp = new Integer[n][n];
        return helper(s, 0, n - 1, dp);
    }

    private int helper(String s, int left, int right, Integer[][] dp) {
        if (left >= right) {
            return 0;
        }
        if (dp[left][right] != null) {
            return dp[left][right];
        }
        if (s.charAt(left) == s.charAt(right)) {
            dp[left][right] = helper(s, left + 1, right - 1, dp);
        } 
        else {
            dp[left][right] = 1 + Math.min(
                    helper(s, left + 1, right, dp),
                    helper(s, left, right - 1, dp)
            );
        }
        return dp[left][right];
    }
}
