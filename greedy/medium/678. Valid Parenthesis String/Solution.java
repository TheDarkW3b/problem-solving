class Solution {
    public boolean checkValidString(String s) {
        int minBracket = 0, maxBracket = 0;

        for (char ch: s.toCharArray()) {
            if (ch == '(') {
                minBracket++;
                maxBracket++;
            } else if (ch == ')') {
                if (minBracket > 0) minBracket--;
                maxBracket--;
            } else {
                if (minBracket > 0) minBracket--;
                maxBracket++;
            }

            if (maxBracket < 0) return false;
        }
        
        return minBracket == 0;
    }
}
