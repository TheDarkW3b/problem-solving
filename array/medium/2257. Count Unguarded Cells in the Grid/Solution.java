class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        boolean[][] seenByGuard = new boolean[m][n];
        boolean[][] isWallOrGuard = new boolean[m][n];

        for (int[] wall : walls) {
            isWallOrGuard[wall[0]][wall[1]] = true;
            seenByGuard[wall[0]][wall[1]] = true;
        }

        for (int[] guard : guards) {
            isWallOrGuard[guard[0]][guard[1]] = true;
            seenByGuard[guard[0]][guard[1]] = true;
        }

        for (int[] guard : guards) {
            int row = guard[0];
            int col = guard[1];

            for (int i = col + 1; i < n; i++) {
                if (isWallOrGuard[row][i]) break;
                seenByGuard[row][i] = true;
            }

            for (int i = col - 1; i >= 0; i--) {
                if (isWallOrGuard[row][i]) break;
                seenByGuard[row][i] = true;
            }

            for (int i = row + 1; i < m; i++) {
                if (isWallOrGuard[i][col]) break;
                seenByGuard[i][col] = true;
            }

            for (int i = row - 1; i >= 0; i--) {
                if (isWallOrGuard[i][col]) break;
                seenByGuard[i][col] = true;
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!seenByGuard[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }
}

// Direction Arrays
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        boolean[][] seenByGuard = new boolean[m][n];
        boolean[][] isWallOrGuard = new boolean[m][n];

        for (int[] wall : walls) {
            isWallOrGuard[wall[0]][wall[1]] = true;
            seenByGuard[wall[0]][wall[1]] = true;
        }

        for (int[] guard : guards) {
            isWallOrGuard[guard[0]][guard[1]] = true;
            seenByGuard[guard[0]][guard[1]] = true;
        }

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        for (int[] guard : guards) {
            int row = guard[0];
            int col = guard[1];

            for (int[] direction : directions) {
                int r = row, c = col;

                while (true) {
                    r += direction[0];
                    c += direction[1];

                    if (r >= m || r < 0 || c >= n || c < 0 || isWallOrGuard[r][c]) break;
                    seenByGuard[r][c] = true;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!seenByGuard[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
