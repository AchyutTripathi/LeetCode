class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return jump(stones, 0, 0, dp);
    }

    boolean jump(int[] stones, int index, int lastJump, int[][] dp) {
        if (index == stones.length - 1){
            return true;
        } 

        if (dp[index][lastJump] != -1) {
            return dp[index][lastJump] == 1;
        }

        for (int nextJump = lastJump - 1; nextJump <= lastJump + 1; nextJump++) {
            if (nextJump <= 0) continue; // invalid jump
        int nextPos = stones[index] + nextJump;

            for (int nextIndex = index + 1; nextIndex < stones.length; nextIndex++) {
                if (stones[nextIndex] == nextPos) {
                    if (jump(stones, nextIndex, nextJump, dp)){
                        dp[index][lastJump] = 1;
                        return true;
                    }
                } else if (stones[nextIndex] > nextPos){
                    break;
                }
            }  
        }
        dp[index][lastJump] = 0;
        return false;
    }
}