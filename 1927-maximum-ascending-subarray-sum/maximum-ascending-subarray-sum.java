class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int prev = nums[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > prev) {
                sum = sum + nums[i];
                prev = nums[i];
            } else {
                max = Math.max (max, sum);
                sum = nums[i];
                prev = nums[i];
            }
        }
        max = Math.max(max, sum);
        return max;
    }
}