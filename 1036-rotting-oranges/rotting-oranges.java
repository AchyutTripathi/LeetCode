class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        // count fresh and put all rotten
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // no fresh oranges
        if (fresh == 0) return 0;
        int time = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // bfs
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;

            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int x = curr[0];
                int y = curr[1];

                for (int d = 0; d < 4; d++) {
                    int row = x + dx[d];
                    int col = y + dy[d];

                    if (row >= 0 && col >= 0 && row < m && col < n && grid[row][col] == 1) {
                        grid[row][col] = 2; // rot it
                        queue.add(new int[]{row, col});
                        fresh--;
                        rotted = true;
                    }
                }
            }
            if (rotted) time++;
        }
        return fresh == 0 ? time : -1;
    }
}