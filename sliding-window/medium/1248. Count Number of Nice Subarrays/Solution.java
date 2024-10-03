class Solution {
    private int helper(int[] arr, int goal) {
        int size = arr.length;
        int count = 0;

        int sum = 0;
        int l = 0, r = 0;

        while(r < size){
            sum += arr[r] % 2;
            while(sum > goal && l <= r){
                sum -= arr[l++] % 2;
            }

            count += r - l + 1;
            r++;
        }
        return count;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }
}
