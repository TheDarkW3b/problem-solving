class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        return solve(n, board, 0);
    }


    private int solve(int n, char[][] board, int col) {
        if (col == n) {
            return 1;
        }

        int count = 0;

        for (int row = 0; row < n; row++) {
            if (isSafe(n, board, row, col)) {
                board[row][col] = 'Q';
                count += solve(n, board, col + 1);
                board[row][col] = '.';
            }
        }

        return count;
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
