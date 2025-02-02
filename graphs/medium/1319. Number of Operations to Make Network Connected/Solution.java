class Solution {
    public static int makeConnected(int n, int[][] connections) {
        DisjointSet ds = new DisjointSet(n);

        int extraCables = 0;

        for (int[] connection : connections) {
            if (!ds.union(connection[0], connection[1])) {
                extraCables++;
            }
        }

        int components = 0;

        for (int i = 0; i < n; i++) {
            if (ds.find(i) == i) {
                components++;
            }
        }

        int requiredCables = components - 1;
        return (extraCables >= requiredCables) ? requiredCables : -1;
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
