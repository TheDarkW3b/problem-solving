class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n = arr.length;

        int ans = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }

                int diff = Math.abs(target - sum);

                if (diff < Math.abs(target - ans)) {
                    ans = sum;
                }
            }
        }

        return ans;
    }
}
