class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        boolean[][] visited = new boolean[m][n];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc, image[sr][sc]});

        visited[sr][sc] = true;
        image[sr][sc] = color;

        int[] directionRow = {-1, 0, 1, 0};
        int[] directionCol = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            int i = cur[0];
            int j = cur[1];
            int initialColor = cur[2];

            for (int k = 0; k < 4; k++) {
                int newRow = i + directionRow[k];
                int newCol = j + directionCol[k];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n
                        && image[newRow][newCol] == initialColor && !visited[newRow][newCol]) {
                    queue.add(new int[]{newRow, newCol, image[newRow][newCol]});
                    visited[newRow][newCol] = true;
                    image[newRow][newCol] = color;
                }
            }
        }

        return image;
    }
}
