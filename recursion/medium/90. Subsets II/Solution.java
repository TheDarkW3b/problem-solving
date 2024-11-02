class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> ans = new ArrayList<>();
        subsetsWithDup(arr, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void subsetsWithDup(int[] arr, int index, List<Integer> current, List<List<Integer>> ans) {
        if (index >= arr.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[index]);
        subsetsWithDup(arr, index + 1, current, ans);

        current.removeLast();
        while (index + 1 < arr.length && arr[index] == arr[index + 1]) index++;

        subsetsWithDup(arr, index + 1, current, ans);
    }
}
