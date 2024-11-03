class Solution {
    public boolean isBalanced(String num) {
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            int sum1 = num.charAt(i) - '0';

            if (i % 2 == 0) {
                sum += sum1;
            } else {
                sum -= sum1;
            }
        }

        return sum == 0;
    }
}
