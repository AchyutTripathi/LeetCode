class Solution {
    public boolean isPalindrome(int x) {
        return isPalindromeCheck(x);
    }
    boolean isPalindromeCheck(int n) {
        if (n < 0) return false;
        int rev = 0;
        int original = n;
        while (n != 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }
        return original == rev;
    }
}