class Solution {
    public int reverse(int x) {
        int rev = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        while (x != 0) {
            int rem = x % 10;
            if (rev > max / 10 || rev < min / 10) {
                return 0;
            }
            rev = rev * 10 + rem; 
            x = x / 10;
        }
        return rev;
    }
}