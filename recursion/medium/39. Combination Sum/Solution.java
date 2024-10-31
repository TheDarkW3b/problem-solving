class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void combinationSum(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> ans) {
        if (index == candidates.length || target <= 0) {
            if (target == 0) {
                ans.add(new ArrayList<>(current));
            }
            return;
        }

        current.add(candidates[index]);
        combinationSum(candidates, target - candidates[index], index, current, ans);

        current.remove(current.size() - 1);
        combinationSum(candidates, target, index + 1, current, ans);
    }
}
