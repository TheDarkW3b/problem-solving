class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if ((sum & 1) != 0) {
            return false;
        }

        int half = sum / 2;

        int n = nums.length;
        Boolean[][] dp = new Boolean[n][half + 1];

        return findSum(0, n, half, nums, dp);
    }

    private boolean findSum(int index, int n, int target, int[] nums, Boolean[][] dp) {
        if (target == 0) {
            return true;
        }

        if (index >= n || target < 0) {
            return false;
        }

        if (dp[index][target] != null) {
            return dp[index][target];
        }

        boolean notTake = findSum(index + 1, n, target, nums, dp);
        boolean take = (target >= nums[index]) && findSum(index + 1, n, target - nums[index], nums, dp);

        return dp[index][target] = notTake || take;
    }
}
