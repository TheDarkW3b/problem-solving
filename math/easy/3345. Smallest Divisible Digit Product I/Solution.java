class Solution {
    public int productOfDigits(int n) {
        int product = 1;

        while (n > 0) {
            product *= n % 10;
            n = n / 10;
        }

        return product;
    }

    public int smallestNumber(int n, int t) {
        for (int i = n; i < Integer.MAX_VALUE; i++) {
            int product = productOfDigits(i);

            if (product % t == 0) {
                return i;
            }
        }

        return -1;
    }
}
