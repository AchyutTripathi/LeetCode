class Solution {
    public int reverseDegree(String s) {
        char[] arr = s.toCharArray();
        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            int asc = arr[i] - 96;
            int rev = 27 - asc;
            int ans = rev * (i + 1);
            add += ans;
        }
        return add;
    }
}