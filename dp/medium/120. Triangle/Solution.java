class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        Integer[][] dp = new Integer[m][m];
        return generateAllCombinations(0, 0, m - 1, dp, triangle);
    }

    private int generateAllCombinations(int i, int j, int m, Integer[][] dp, List<List<Integer>> triangle) {
        if (i == m) {
            return triangle.get(i).get(j);
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int down = generateAllCombinations(i + 1, j, m, dp, triangle);
        int downRight = generateAllCombinations(i + 1, j + 1, m, dp, triangle);

        return dp[i][j] = triangle.get(i).get(j) + Math.min(down, downRight);
    }
}
