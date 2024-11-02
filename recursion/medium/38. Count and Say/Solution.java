class Solution {
    private String countAndSay(int n, StringBuilder ans) {
        if (n == 1) {
            return "1";
        }

        String s = countAndSay(n - 1, new StringBuilder());

        int counter = 1;
        char beforeCharacter = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == beforeCharacter) {
                counter++;
            } else {
                ans.append(counter).append(beforeCharacter);
                beforeCharacter = s.charAt(i);
                counter = 1;
            }
        }

        ans.append(counter).append(beforeCharacter);

        return ans.toString();
    }

    public String countAndSay(int n) {
        return countAndSay(n, new StringBuilder());
    }
}
