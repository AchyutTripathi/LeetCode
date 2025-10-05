class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < obstacleGrid.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return func(obstacleGrid, 0, 0, dp);
    }

    private int func(int[][] obstacleGrid, int row, int col, int[][] dp) {
        if (row >= obstacleGrid.length || col >= obstacleGrid[0].length || obstacleGrid[row][col] == 1) {
            return 0;
        }
        if (row == obstacleGrid.length - 1 && col == obstacleGrid[0].length - 1) {
            return 1;
        }
        if (dp[row][col] != -1) return dp[row][col];
        return dp[row][col] = func(obstacleGrid, row + 1, col, dp) + func(obstacleGrid, row, col + 1, dp);
    }
}

