class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> ans = new ArrayList<>();
        int n = mat.length;
        int[][] visited = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(visited[i], 0);
        }

        if (mat[0][0] == 1) {
            findPath(n, mat, visited, 0, 0, new StringBuilder(), ans);
        }

        if (ans.isEmpty()) {
            ans.add("-1");
        }
        
        return ans;
    }

    private void findPath(int n, int[][] mat, int[][] visited, int row, int col, StringBuilder s, ArrayList<String> ans) {
        if (row == n - 1 && col == n - 1) {
            ans.add(s.toString());
            return;
        }

        visited[row][col] = 1;

        if (row < n - 1 && mat[row + 1][col] == 1 && visited[row + 1][col] == 0) {
            findPath(n, mat, visited, row + 1, col, s.append("D"), ans);
            s.deleteCharAt(s.length() - 1);
        }

        if (col < n - 1 && mat[row][col + 1] == 1 && visited[row][col + 1] == 0) {
            findPath(n, mat, visited, row, col + 1, s.append("R"), ans);
            s.deleteCharAt(s.length() - 1);
        }

        if (row > 0 && mat[row - 1][col] == 1 && visited[row - 1][col] == 0) {
            findPath(n, mat, visited, row - 1, col, s.append("U"), ans);
            s.deleteCharAt(s.length() - 1);
        }

        if (col > 0 && mat[row][col - 1] == 1 && visited[row][col - 1] == 0) {
            findPath(n, mat, visited, row, col - 1, s.append("L"), ans);
            s.deleteCharAt(s.length() - 1);
        }

        visited[row][col] = 0;
    }
}
