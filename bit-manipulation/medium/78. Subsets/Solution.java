// Optimal Solution: Recursion 
class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        subsets(arr, 0, ans, new ArrayList<>());
        return ans;
    }

    private static void subsets(int[] arr, int index, List<List<Integer>> ans, List<Integer> current) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[index]);
        subsets(arr, index + 1, ans, current);

        current.removeLast();
        subsets(arr, index + 1, ans, current);
    }
}

// Better Solution: POWER SET ALGORITHM
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
