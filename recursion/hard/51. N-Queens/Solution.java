class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(n, board, 0, ans);
        return ans;
    }

    private void solve(int n, char[][] board, int col, List<List<String>> ans) {
        if (col == n) {
            List<String> current = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                current.add(new String(board[i]));
            }

            ans.add(current);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(n, board, row, col)) {
                board[row][col] = 'Q';
                solve(n, board, col + 1, ans);
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(int n, char[][] board, int row, int col) {
        int dummyRow = row, dummyCol = col;

        while (col-- > 0) {
            if (board[row][col] == 'Q') return false;
        }

        col = dummyCol;
        while (row-- > 0 && col-- > 0) {
            if (board[row][col] == 'Q') return false;
        }

        row = dummyRow;
        col = dummyCol;
        while (row++ < n - 1 && col-- > 0) {
            if (board[row][col] == 'Q') return false;
        }

        return true;
    }
}
