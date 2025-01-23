class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int[] directionsRow = {-1, 0, 1, 0};
        int[] directionsCol = {0, 1, 0, -1};

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    dfs(grid, m, n, visited, i, j, directionsRow, directionsCol);
                }
            }
        }

        return count;
    }

    private void dfs(
            char[][] grid, int m, int n,
            boolean[][] visited, int i, int j,
            int[] directionsRow, int[] directionsCol
    ) {
        visited[i][j] = true;
        
        for (int k = 0; k < 4; k++) {
            int newRow = i + directionsRow[k];
            int newCol = j + directionsCol[k];

            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
                if (grid[newRow][newCol] == '1' && !visited[newRow][newCol]) {
                    dfs(grid, m, n, visited, newRow, newCol, directionsRow, directionsCol);
                }
            }
        }
    }
}
