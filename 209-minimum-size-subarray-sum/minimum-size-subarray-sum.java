class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int low = 0;
       int minLen = Integer.MAX_VALUE;
       int sum = 0;
       for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                minLen = Math.min(minLen, i - low + 1);
                sum = sum - nums[low];
                low++;
            } 
        }
        if (minLen != Integer.MAX_VALUE) {
            return minLen;
        }
        return 0;
    }
}
