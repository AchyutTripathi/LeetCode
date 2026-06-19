class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int [n + 1];
        int high = 0;
        arr[0] = 0;
        for(int i = 0; i < gain.length; i++) {
            arr[i + 1] = arr[i] + gain[i];
        }
        for(int i = 0; i < arr.length; i++) {
            high = Math.max(high, arr[i]);
        }
        return high;
    }
}