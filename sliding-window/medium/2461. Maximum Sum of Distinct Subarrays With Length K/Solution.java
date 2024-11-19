class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        long maxSum = 0;
        long sum = 0;
        int l = 0, r = 0;

        while (r < arr.length) {
            int value = arr[r];

            map.put(value, map.getOrDefault(value, 0) + 1);
            sum += value;

            while (map.size() > k || map.get(value) > 1) {
                int leftValue = arr[l];
                map.put(leftValue, map.get(leftValue) - 1);

                if (map.get(leftValue) == 0) {
                    map.remove(leftValue);
                }

                sum -= leftValue;
                l++;
            }

            if (map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }

            r++;
        }

        return maxSum;
    }
}
