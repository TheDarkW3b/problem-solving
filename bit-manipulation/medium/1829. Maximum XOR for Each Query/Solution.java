class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int maxXor = (1 << maximumBit) - 1;
        int n = nums.length;

        int[] ans = new int[n];

        int xor = 0;
        for (int num: nums) {
            xor ^= num;
        }

        for (int i = 0; i < n; i++) {
            ans[i] = xor ^ maxXor;
            xor ^= nums[n - i - 1];
        }

        return ans;
    }
}
