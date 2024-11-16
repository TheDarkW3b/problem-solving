class Solution {
    public int[] resultsArray(int[] arr, int k) {
        int[] ans = new int[arr.length - k + 1];
        Arrays.fill(ans, -1);

        int l = 0, r = 0;

        while (r < arr.length) {
            if (r > 0 && arr[r] - arr[r - 1] != 1) {
                l = r;
            }

            while ((r - l + 1) > k) {
                l++;
            }

            if ((r - l + 1) == k) {
                ans[r - k + 1] = arr[r];
            }

            r++;
        }

        return ans;
    }
}
