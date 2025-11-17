class Solution {
    public int minLengthAfterRemovals(String s) {
        char[] arr= s.toCharArray();
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] != arr[j]) {
                i++;
                j--;
            } else {
                return j - i + 1;
            }
        }
        return 0; 
    }
}