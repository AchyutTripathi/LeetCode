// class Solution {
//     int[] freq;
//     Integer[] memo;
//     int maxVal;
//     public int deleteAndEarn(int[] nums) {
//         maxVal = 0;
//         for (int n : nums) maxVal = Math.max(maxVal, n);
//         freq = new int[maxVal + 1];
//         for (int n : nums) freq[n] += n;
//         memo = new Integer[maxVal + 1];
//         return solve(1);
//     }

//     private int solve(int i) {
//         if (i > maxVal) return 0;
//         if (memo[i] != null) return memo[i];
//         int skip = solve(i + 1);
//         int take = freq[i] + solve(i + 2);
//         return memo[i] = Math.max(skip, take);
//     }
// }










class Solution {
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 0) return 0;
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] freq = new int[max + 1];
        for (int num : nums) {
            freq[num]++;
        }
        int[] dp = new int[max + 1];
        dp[0] = 0;
        dp[1] = freq[1] * 1;

        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(
                dp[i - 1],
                dp[i - 2] + i * freq[i]
            );
        }
        return dp[max];
    }
}
