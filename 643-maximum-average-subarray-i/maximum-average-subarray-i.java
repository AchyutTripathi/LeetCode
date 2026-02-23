class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxAvg = Integer.MIN_VALUE;
        int prev = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAvg = Math.max(maxAvg, sum / k);
        for (int i = k; i < nums.length; i++) {
            sum -= nums[prev];
            sum += nums[i];
            prev++;
            maxAvg = Math.max(maxAvg, sum / k);
        }
        return maxAvg;
    }
}