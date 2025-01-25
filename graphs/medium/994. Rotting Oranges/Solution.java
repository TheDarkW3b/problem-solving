class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        int freshOranges = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        if (freshOranges == 0) {
            return 0;
        }

        int[] directionRow = {-1, 0, 1, 0};
        int[] directionCol = {0, 1, 0, -1};

        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;

            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();
                int row = poll[0];
                int col = poll[1];

                for (int k = 0; k < 4; k++) {
                    int newRow = row + directionRow[k];
                    int newCol = col + directionCol[k];

                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n &&
                            grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        queue.add(new int[]{newRow, newCol});
                        rotted = true;
                        freshOranges--;
                    }
                }
            }

            if (rotted) {
                time++;
            }
        }

        return freshOranges == 0 ? time : -1;
    }
}
