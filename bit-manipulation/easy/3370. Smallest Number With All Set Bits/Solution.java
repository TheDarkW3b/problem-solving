class Solution {
    public int smallestNumber(int n) {
        if (n <= 1) return 1;

        for (int i = n; i < Integer.MAX_VALUE; i++) {
            if ((i & (i - 1)) == 0) {
                if (i - 1 >= n) {
                    return i - 1;
                }
            }
        }

        return -1;
    }
}
