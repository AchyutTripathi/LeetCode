class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       for (int i = 0; i < image.length; i++) {
        image[i] = reverse(image[i]);
        image[i] = invert(image[i]);
       }
       return image;
    }

    int[] reverse(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        return nums;
    }

    int[] invert(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] == 0) ? 1 : 0;
        }
        return nums;
    }
}