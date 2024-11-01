class Solution {
    public void combinationSum2(int[] arr, int target, int index, List<Integer> ds, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        if (index >= arr.length || target < 0) {
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (arr[i] > target) break; 
            
            if (i > index && arr[i - 1] == arr[i]) continue;

            ds.add(arr[i]);
            combinationSum2(arr, target - arr[i], i + 1, ds, ans);

            ds.removeLast();
        }
    }

    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();
        combinationSum2(arr, target, 0, new ArrayList<>(), ans);
        return ans;
    }
}
