class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        Paths(root, ans, new ArrayList<>());
        return ans;
    }

    private static void Paths(Node root, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> path) {
        if (root == null) return;

        path.add(root.data);

        if (root.left == null && root.right == null) {
            ans.add(new ArrayList<>(path));
        }

        Paths(root.left, ans, path);
        Paths(root.right, ans, path);

        path.remove(path.size() - 1);
    }
}
        
