class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] ans = new int[m][n];
        boolean[][] visited = new boolean[m][n];

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new int[]{i, j, 0});
                    visited[i][j] = true;
                }
            }
        }

        int[] distanceRow = new int[]{-1, 0, 1, 0};
        int[] distanceCol = new int[]{0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            int i = poll[0];
            int j = poll[1];
            int distance = poll[2];

            ans[i][j] = distance;

            for (int k = 0; k < 4; k++) {
                int newRow = i + distanceRow[k];
                int newCol = j + distanceCol[k];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    queue.add(new int[]{newRow, newCol, distance + 1});
                    visited[newRow][newCol] = true;
                }
            }
        }

        return ans;
    }
}
