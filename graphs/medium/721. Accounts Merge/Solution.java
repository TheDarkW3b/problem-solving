class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();

        DisjointSet ds = new DisjointSet(n);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String email = accounts.get(i).get(j);

                if (!map.containsKey(email)) {
                    map.put(email, i);
                } else {
                    ds.union(i, map.get(email));
                }
            }
        }

        Map<Integer, TreeSet<String>> mergedAccounts = new HashMap<>();
        for (String mail : map.keySet()) {
            int parent = ds.find(map.get(mail));
            mergedAccounts.computeIfAbsent(parent, k -> new TreeSet<>()).add(mail);
        }

        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<Integer, TreeSet<String>> entrySet : mergedAccounts.entrySet()) {
            List<String> account = new ArrayList<>();
            account.add(accounts.get(entrySet.getKey()).get(0));
            account.addAll(entrySet.getValue());

            ans.add(account);
        }

        return ans;
    }
}

class DisjointSet {
    private final int[] parent;
    private final int[] rank;

    public DisjointSet(int n) {
        parent = new int[n + 1];
        rank = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    public boolean union(int x, int y) {
        int parentOfX = find(x);
        int parentOfY = find(y);

        if (parentOfX == parentOfY) return false; // belongs to same set

        if (rank[parentOfX] < rank[parentOfY]) {
            parent[parentOfX] = parentOfY;
        } else if (rank[parentOfX] > rank[parentOfY]) {
            parent[parentOfY] = parentOfX;
        } else {
            parent[parentOfY] = parentOfX;
            rank[parentOfX]++;
        }

        return true;
    }
}
