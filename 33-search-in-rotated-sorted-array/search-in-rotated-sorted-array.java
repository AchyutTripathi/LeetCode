class Solution {
    int search(int[] nums, int target){
        return find(nums, target, 0, nums.length - 1);
    }

    int find (int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return find(arr, target, start, mid - 1);
            } else {
                return find(arr, target, mid + 1, end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return find(arr, target, mid + 1, end);
        }

        return find(arr, target, start, mid - 1);
    }
}

