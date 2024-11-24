class Solution {
    public int minimumSumSubarray(List<Integer> nums, int begin, int end) {
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            int sum = 0;

            for (int j = i; j < nums.size(); j++) {
                sum += nums.get(j);

                if (j - i + 1 >= begin && j - i + 1 <= end && sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}

// Didn't worked sed
    public static int minimumSumSubarray(List<Integer> nums, int begin, int end) {
        int l = 0, r = 0;

        int minSum = Integer.MAX_VALUE;

        int sum = 0;
        while (r < nums.size()) {
            sum += nums.get(r);

            while (r - l + 1 > end && l <= r) {
                sum -= nums.get(l);
                l++;
            }

            if (r - l + 1 >= begin && r - l + 1 <= end && sum > 0) {
                minSum = Math.min(minSum, sum);
            }

            r++;
        }

        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
