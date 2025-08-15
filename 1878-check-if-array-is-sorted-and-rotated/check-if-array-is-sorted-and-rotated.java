class Solution {
    public boolean check(int[] nums) {
        int flag = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {
                continue;
            } else if (flag != 0 || nums[nums.length - 1] > nums[0]) {
                return false;
            } else {
                flag = 1;
                continue;
            }
        }
        return true;
    }
}