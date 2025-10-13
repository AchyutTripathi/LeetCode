class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int [n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        return jump (nums, n - 1, dp);
    }

    int jump (int[] nums, int index, int[] dp) {
        if (index < 0) return 0;
        if (index == 0) return nums[0];

        if (dp[index] != -1) return dp[index];

        int rob = nums[index] + jump(nums, index - 2, dp);
        int skip = jump(nums, index - 1, dp);
        return dp[index] = Math.max(rob, skip);
    }
}