class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        return find (nums, target, 0, nums.length - 1);
    }

    boolean find(int[] arr, int target, int start, int end) {
        if (start > end) {
            return false;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]){
            return true;
        }

        if (arr[start] < arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return find (arr, target, start, mid - 1);
            } else {
                return find (arr, target, mid + 1, end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return find (arr, target, mid + 1, end);
        }

        return find (arr, target, start, mid - 1);
    }
}