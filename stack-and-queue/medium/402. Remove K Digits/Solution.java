// Deque-Based Solution
class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";

        Deque<Character> deque = new LinkedList<>();

        for (char ch : num.toCharArray()) {
            while (!deque.isEmpty() && k > 0 && deque.peekLast() > ch) {
                deque.removeLast();
                k--;
            }
            deque.addLast(ch);
        }

        while (k > 0) {
            deque.removeLast();
            k--;
        }

        StringBuilder ans = new StringBuilder();
        while (!deque.isEmpty()) {
            ans.append(deque.removeFirst());
        }

        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        return ans.isEmpty() ? "0" : ans.toString();
    }
}

// Stack-Based Solution
class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";

        Stack<Character> stack = new Stack<>();
        int i = 0;

        while (i < num.length()) {
            while (!stack.isEmpty() && k > 0 && ((stack.peek() - '0') > (num.charAt(i) - '0'))) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        ans.reverse();

        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        return ans.isEmpty() ? "0" : ans.toString();
    }
}
