class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) continue;

                boolean toSortDesc = j == 0;

                List<Integer> diagonalElements = new ArrayList<>();

                int tempI = i;
                int tempJ = j;

                while (tempI < n && tempJ < n) {
                    visited[tempI][tempJ] = true;
                    diagonalElements.add(grid[tempI][tempJ]);
                    tempJ++;
                    tempI++;
                }

                if (toSortDesc) {
                    diagonalElements.sort(Collections.reverseOrder());
                } else {
                    Collections.sort(diagonalElements);
                }

                tempI = i;
                tempJ = j;
                int k = 0;

                while (tempI < n && tempJ < n) {
                    grid[tempI][tempJ] = diagonalElements.get(k++);
                    tempJ++;
                    tempI++;
                }
            }
        }

        return grid;
    }
}
