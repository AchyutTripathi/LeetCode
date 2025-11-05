class Solution {
    public String makeFancyString(String s) {
        char[] arr = s.toCharArray();
        char last = arr[0];
        int count = 1;
        int pos = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != last) {
                last = arr[i];
                count = 0;
            }
            if (++count > 2) continue;

            arr[pos++] = arr[i]; 
        }
        return new String(arr, 0, pos);
    }
}