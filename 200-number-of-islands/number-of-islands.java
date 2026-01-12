class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (grid[row][col] == '1') {
                    count++;
                    dfs(row, col, grid);
                }
            }
        }
        return count;
    }

    private void dfs(int row, int col, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (row < 0 || row >= n || col < 0 || col >= m || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';
        dfs(row + 1, col, grid);
        dfs(row - 1, col, grid);
        dfs(row, col + 1, grid);
        dfs(row, col - 1, grid);
    }
}