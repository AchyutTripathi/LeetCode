class Solution {
    public int findMiddleIndex(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int leftSum = 0;
            int leftInd = 0;
            while (leftInd < i) {
                leftSum += nums[leftInd];
                leftInd++;
            }
            int rightSum = 0;
            int rightInd = i + 1;
            while (rightInd < nums.length) {
                rightSum += nums[rightInd];
                rightInd++;
            }
            if (leftSum == rightSum) {
                return i;
            }
            i++;
        }
        return -1;
    }
}