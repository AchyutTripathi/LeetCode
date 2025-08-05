class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        // sort the array
        Arrays.sort(nums);
        int lastSmaller = Integer.MIN_VALUE;
        int current = 0;
        int longest = 1;

        // find longest sequence
        for (int  i = 0; i < n; i++) {
            if (nums[i] - 1 == lastSmaller) {
                current += 1;
                lastSmaller = nums[i];
            } else if (nums[i] != lastSmaller) {
                current = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, current);
        }
        return longest;
    }
}