class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        int maxDiagonal = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int currDiagonal = l * l + w * w;

            if (currDiagonal > maxDiagonal || (currDiagonal == maxDiagonal && l * w > maxArea)) {
                maxDiagonal = currDiagonal;
                maxArea = l * w;
            }
        }
        return maxArea;
    }
}