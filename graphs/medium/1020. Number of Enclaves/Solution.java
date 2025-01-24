class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int[] directionRow = {-1, 0, 1, 0};
        int[] directionCol = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            if (grid[0][i] == 1) {
                dfs(grid, 0, i, visited, m, n, directionRow, directionCol);
            }

            if (grid[m - 1][i] == 1) {
                dfs(grid, m - 1, i, visited, m, n, directionRow, directionCol);
            }
        }

        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) {
                dfs(grid, i, 0, visited, m, n, directionRow, directionCol);
            }

            if (grid[i][n - 1] == 1) {
                dfs(grid, i, n - 1, visited, m, n, directionRow, directionCol);
            }
        }

        int enclaves = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && (grid[i][j] == 1)) {
                    enclaves++;
                }
            }
        }

        return enclaves;
    }

    private void dfs(
            int[][] grid, int i, int j,
            boolean[][] visited, int m, int n,
            int[] directionsRow, int[] directionsCol
    ) {
        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int newRow = i + directionsRow[k];
            int newCol = j + directionsCol[k];

            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n
                    && grid[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                dfs(grid, newRow, newCol, visited, m, n, directionsRow, directionsCol);
            }
        }
    }
}
