class Solution {
    public List<String> stringSequence(String target) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            char currentChar = target.charAt(i);
            sb.append("a");
            ans.add(sb.toString());

            for (char ch = 'b'; ch <= currentChar; ch++) {
                sb.setCharAt(sb.length() - 1, ch);
                ans.add(sb.toString());
            }
        }

        return ans;
    }
}
