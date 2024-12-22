class Solution {
    public int minimumOperations(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--){

            if (set.contains(arr[i])) {
                return (i + 3) / 3;
            }

            set.add(arr[i]);
        }

        return 0;
    }
}
