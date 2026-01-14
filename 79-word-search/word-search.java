class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length - 1;
        int col = board[0].length - 1;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                if (board[i][j] == word.charAt(0) && backtrack(i, j, board, word, row, col, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean backtrack(int i, int j, char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) return true;

        if (i > row || j > col || i < 0 || j < 0 || board[i][j] != word.charAt(index)) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        
        boolean found = backtrack(i + 1, j, board, word, row, col, index + 1) ||
                        backtrack(i - 1, j, board, word, row, col, index + 1) ||
                        backtrack(i, j + 1, board, word, row, col, index + 1) ||
                        backtrack(i, j - 1, board, word, row, col, index + 1);
        board[i][j] = temp;
        return found;
    }
}