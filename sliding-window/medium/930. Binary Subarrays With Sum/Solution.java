class Solution {
    private int helper(int[] arr, int goal) {
        int size = arr.length;
        int count = 0;

        int sum = 0;
        int l = 0, r = 0;

        while(r < size){
            sum += arr[r];
            while(sum > goal && l <= r){
                sum -= arr[l++];
            }

            count += r - l + 1;
            r++;
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums, goal) - helper(nums, goal - 1);
    }
}
