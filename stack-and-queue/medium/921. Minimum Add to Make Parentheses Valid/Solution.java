// GREEDY SOLUTION
class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0, close = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    close++;
                }
            }
        }

        return open + close;
    }
}

// STACK SOLUTION
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); 
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.size();
    }
}
