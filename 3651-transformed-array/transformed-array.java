class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int [n];
        int i = 0;
        while (i < arr.length) {
            int idx = 0;
            if (nums[i] == 0) {
                arr[i] = nums[i];
            }
            if (nums[i] < 0) {
                int a = Math.abs(nums[i]);
                idx = i;
                while(a > 0) {
                    if (idx < 0) {
                        idx = nums.length - 1;
                    } else {
                        a--;
                        idx--;
                    }
                }
                if (idx < 0) {
                    idx = nums.length - 1;
                }
                arr[i] = nums[idx];
            } else {
                int b = nums[i];
                idx = i;
                while (b > 0) {
                    if (idx >= nums.length) {
                        idx = 0;
                    } else {
                        idx++;
                        b--;
                    }
                }
                if (idx >= nums.length) {
                    idx = 0;
                }
                arr[i] = nums[idx];
            }
            i++;
        }
        return arr;
    }
}