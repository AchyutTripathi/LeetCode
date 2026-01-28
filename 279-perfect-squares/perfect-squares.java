class Solution {
    int[] memo;
    public int numSquares(int n) {
        if (n == 0) return 0;
        memo = new int [n + 1];
        return solve(n);
    }
    private int solve(int n) {
        if (n == 0) return 0;
        int count = Integer.MAX_VALUE;
        if (memo[n] != 0) return memo[n];
        for (int i = 1; i * i <= n; i++) {
            count = Math.min(count, 1 + solve(n - i * i));
        }
        memo[n] = count;
        return count;
    }
}
