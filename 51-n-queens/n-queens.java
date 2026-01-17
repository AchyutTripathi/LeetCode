class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> answer = new ArrayList<>();
        char[][] nQueens = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(nQueens[i], '.');
        }
        placeQueens(n, answer, nQueens, 0);
        return answer;
    }

    private void placeQueens(int n, List<List<String>> answer, char[][] nQueens, int row) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] rowArray : nQueens) {
                solution.add(new String(rowArray));
            }
            answer.add(solution);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(n, nQueens, row, col)) {
                nQueens[row][col] = 'Q';
                placeQueens(n, answer, nQueens, row + 1);
                nQueens[row][col] = '.';
            }
        }
    }
    
    private boolean isSafe(int n, char[][] nQueens, int row, int col) {
        // vertical check
        for (int i = 0; i < row; i++) {
            if (nQueens[i][col] == 'Q') {
                return false;
            }
        }
        // left diagonal check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }
        // right diagonal check
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}