class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];       
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i <= nums.length - 1; i++) {
            prefix[i] = nums[i] * prefix[i - 1];
        }
        suffix[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = nums[i] * suffix[i + 1];
        }
        result[0] = suffix[1];
        result[nums.length - 1] = prefix[nums.length - 2];
        for (int i = 1; i <= nums.length - 2; i++) {
            result[i] = prefix[i - 1] * suffix[i + 1];
        }
        return result;
    }
}
