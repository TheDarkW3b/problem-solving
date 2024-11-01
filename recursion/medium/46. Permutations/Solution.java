class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(arr, 0, ans);
        return ans;
    }

    private void permute(int[] arr, int index, List<List<Integer>> ans) {
        if (index == arr.length) {
           List<Integer> current = new ArrayList<>();

           for (int num : arr) current.add(num);

           ans.add(current);

           return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1, ans);
            swap(arr, index, i);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
