class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];

        int[] directionRow = {-1, 0, 1, 0};
        int[] directionCol = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i, visited, m, n, directionRow, directionCol);
            }

            if (board[m - 1][i] == 'O') {
                dfs(board, m - 1, i, visited, m, n, directionRow, directionCol);
            }
        }

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0, visited, m, n, directionRow, directionCol);
            }

            if (board[i][n - 1] == 'O') {
                dfs(board, i, n - 1, visited, m, n, directionRow, directionCol);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && (board[i][j] == 'O')) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(
            char[][] board, int i, int j,
            boolean[][] visited, int m, int n,
            int[] directionsRow, int[] directionsCol
    ) {
        visited[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int newRow = i + directionsRow[k];
            int newCol = j + directionsCol[k];

            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n
                    && board[newRow][newCol] == 'O' && !visited[newRow][newCol]) {
                dfs(board, newRow, newCol, visited, m, n, directionsRow, directionsCol);
            }
        }
    }
}
