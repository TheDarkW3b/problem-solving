class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int balance = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(balance > 0)
                    stringBuilder.append(ch);
                balance++;
            } else {
                balance--;
                if(balance > 0)
                    stringBuilder.append(ch);
            }
        }
        
        return stringBuilder.toString();
    }
}
