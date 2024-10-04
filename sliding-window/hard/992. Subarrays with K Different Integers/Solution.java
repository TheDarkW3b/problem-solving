class Solution {
    private int helper(int[] arr, int k){
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        int l = 0, r = 0;

        while(r < arr.length){
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while(map.size() > k && l <= r){
                int leftInt = arr[l];
                map.put(leftInt, map.get(leftInt) - 1);
                if(map.get(leftInt) == 0) map.remove(leftInt);
                l++;
            }

            count += r - l + 1;

            r++;
        }
        return count;
    }

    public int subarraysWithKDistinct(int[] arr, int k) {
        return helper(arr, k) - helper(arr, k - 1);
    }
}
