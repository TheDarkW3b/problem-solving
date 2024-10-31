class Solution {
    public List<String> generateParenthesis(int n) {
        if (n == 0) return new ArrayList<>();

        List<String> ans = new ArrayList<>();
        generateParenthesis(n, 0, 0, new StringBuilder(), ans);
        return ans;
    }

    private void generateParenthesis(int n, int open, int close, StringBuilder current, List<String> ans) {
        if (n * 2 == current.length()) {
            ans.add(current.toString());
            return;
        }

        if (open < n) {
            generateParenthesis(n, open + 1, close, current.append("("), ans);
            current.deleteCharAt(current.length() - 1);
        }

        if (close < open) {
            generateParenthesis(n, open, close + 1, current.append(")"), ans);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
