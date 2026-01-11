class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, area = 0, max = Integer.MIN_VALUE;
        while (left < right) {
            area = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;        
    }
}
