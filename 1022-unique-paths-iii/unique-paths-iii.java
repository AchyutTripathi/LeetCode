class Solution {
    int rows, cols;
    int emptyCells = 0;
    int result = 0;

    public int uniquePathsIII(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int startRow = 0, startCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) emptyCells++;
                else if (grid[i][j] == 1) {
                    startRow = i;
                    startCol = j;
                }
            }
        }
        backtrack(grid, startRow, startCol, emptyCells);
        return result;
    }

    private void backtrack(int[][] grid, int r, int c, int remaining) {
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == -1) {
            return;
        }

        if (grid[r][c] == 2) {
            if (remaining == -1) {
                result++;
            }
            return;
        }

        grid[r][c] = -1;

        backtrack(grid, r + 1, c, remaining - 1);
        backtrack(grid, r - 1, c, remaining - 1);
        backtrack(grid, r, c + 1, remaining - 1);
        backtrack(grid, r, c - 1, remaining - 1);

        grid[r][c] = 0;
    }
}
