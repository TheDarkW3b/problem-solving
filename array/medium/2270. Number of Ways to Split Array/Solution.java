class Solution {
    public int waysToSplitArray(int[] arr) {
        int n = arr.length;
        long[] prefix = new long[n + 1];
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
            sum += arr[i - 1];
        }

        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            long firstPart = prefix[i + 1];
            long secondPart = prefix[prefix.length - 1] - firstPart;

            if (firstPart >= secondPart) {
                count++;
            }
        }

        return count;
    }
}
