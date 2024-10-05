class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> subsets = new ArrayList<>();
        int n = arr.length;
        int noOfSubsets = 1 << n;

        for(int i = 0; i < noOfSubsets; i++){
            List<Integer> subset = new ArrayList<>();
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0) subset.add(arr[j]);
            }
            subsets.add(subset);
        }

        return subsets;
    }
}
