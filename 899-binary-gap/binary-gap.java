class Solution {
    public int binaryGap(int n) {
        int pos = 0;
        int maxGap = 0;
        int prev = -1;
        while (n > 0) {
            // if current bit == 1
            if (n % 2 == 1) {
                if (prev != -1) {
                    maxGap = Math.max(maxGap, pos - prev);
                }
                prev = pos;
            }
            // move to the next bit
            n = n / 2;
            pos++;
        }
        return maxGap;
    }
}