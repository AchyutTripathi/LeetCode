class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return (int) mergeSort(nums, 0, n - 1);
    }

    public static long doCount(int[] arr, int start, int mid, int end) {
        long count = 0;
        int j = mid + 1;
        for (int i = start; i <= mid; i++) {
            while (j <= end && (long) arr[i] > 2 * (long) arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        return count;
    }

    public static void merge(int[] nums, int low, int mid, int high) {
          int i = low;
        int j = mid+1;

        int ans[] = new int[(high - low + 1)];
        int idx = 0;
        while(i <= mid && j <= high)
        {
            if(nums[i] <= nums[j]) ans[idx++] = nums[i++];
            else ans[idx++] = nums[j++];
        }

        while(i <= mid) ans[idx++] = nums[i++];
        while(j <= high) ans[idx++] = nums[j++];

       for(int p = 0; p < ans.length; p++)
       {
          nums[low + p] = ans[p];
       }
    }

   public static long mergeSort(int[] nums, int start , int end){
        if(start < end){
            int mid =( start + end) / 2;
            long count =  mergeSort(nums,start,mid) + mergeSort(nums,mid + 1, end );
            count += doCount(nums,start,mid,end);
            merge(nums, start, mid , end);
            return count;
        }
    return 0;
    }
}
