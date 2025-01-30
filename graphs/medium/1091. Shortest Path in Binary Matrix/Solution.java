class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;

        int[][] dist = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        Queue<int[]> queue = new LinkedList<>(); // new int[]{i, j, distance}
        queue.add(new int[]{0, 0, 1});
        dist[0][0] = 1;

        int[] distanceRow = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] distanceCol = {-1, 0, 1, 1, 1, 0, -1, -1};

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int i = poll[0];
            int j = poll[1];
            int distance = poll[2];

            if (i == n - 1 && j == n - 1) {
                return distance;
            }

            for (int k = 0; k < 8; k++) {
                int newRow = i + distanceRow[k];
                int newCol = j + distanceCol[k];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 0) {
                    if (distance + 1 < dist[newRow][newCol]) {
                        dist[newRow][newCol] = distance + 1;
                        queue.add(new int[]{newRow, newCol, distance + 1});
                    }
                }
            }
        }

        return -1;
    }
}
