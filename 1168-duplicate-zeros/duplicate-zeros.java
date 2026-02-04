class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arr[i] != 0) {
                ans[j] = arr[i];
                j++;
            } else {
                ans[j] = 0;
                j++;
                if (j < n) {
                    ans[j] = 0;
                    j++;
                }
            }
            i++;
        }
        for (int k = 0; k < n; k++) {
            arr[k] = ans[k];
        }
    }
}
