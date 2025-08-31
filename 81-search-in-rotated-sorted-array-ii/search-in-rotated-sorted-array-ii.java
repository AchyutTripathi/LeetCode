class Solution {
    public boolean search(int[] nums, int target) {
        
        // we are using case of line no 21 in place of this
        // Arrays.sort(nums);

        return find (nums, target, 0, nums.length - 1);
    }

    boolean find(int[] arr, int target, int start, int end) {
        if (start > end) {
            return false;
        }

        int mid = start + (end - start) / 2;


        if (arr[mid] == target){
            return true;
        }

        // only this case is different from Search in Rotated Sorted Array I
        if(arr[mid] == arr[start]) {
            return find (arr, target, start + 1, end);
        }


        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target < arr[mid]) {
                return find (arr, target, start, mid - 1);
            } else {
                return find (arr, target, mid + 1, end);
            }
        }


        if (arr[mid] < target && target <= arr[end]) {
            return find (arr, target, mid + 1, end);
        }

        return find (arr, target, start, mid - 1);
    }
}