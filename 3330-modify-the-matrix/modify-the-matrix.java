class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = maxNum(matrix, i, j, max); 
                }
            }
        }
        return matrix;
    }

    private int maxNum(int[][] matrix, int row, int col, int max) {
        for (int i = 0; i <= matrix.length - 1; i++) {
            max = Math.max(max, matrix[i][col]);
        }
        return max;
    }
}