class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < obstacleGrid.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return backtrack(obstacleGrid, dp, 0, 0);
    }
    private int backtrack(int[][] obstacleGrid, int[][] dp, int r, int c) {
        if (r >= obstacleGrid.length || c >= obstacleGrid[0].length || obstacleGrid[r][c] == 1) {
            return 0;
        }
        if (r == obstacleGrid.length - 1 && c == obstacleGrid[0].length - 1) {
            return 1;
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        return dp[r][c] = backtrack(obstacleGrid, dp, r + 1, c) + backtrack(obstacleGrid, dp, r, c + 1); 
    }
}
