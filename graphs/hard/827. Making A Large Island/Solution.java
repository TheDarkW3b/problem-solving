class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length;

        DisjointSet ds = new DisjointSet(n * n);

        int[] directionRow = {-1, 0, 1, 0};
        int[] directionCol = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) continue;

                for (int k = 0; k < 4; k++) {
                    int newRow = i + directionRow[k];
                    int newCol = j + directionCol[k];

                    if (isValid(newRow, newCol, n) && grid[newRow][newCol] == 1) {
                        int node = (i * n) + j;
                        int newNode = (newRow * n) + newCol;

                        ds.union(node, newNode);
                    }
                }
            }
        }

        int largestIsland = 0;
        for (int i = 0; i < n * n; i++) {
            if (grid[i / n][i % n] == 1) {
                largestIsland = Math.max(largestIsland, ds.size[ds.find(i)]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) continue;

                Set<Integer> set = new HashSet<>();

                for (int k = 0; k < 4; k++) {
                    int newRow = i + directionRow[k];
                    int newCol = j + directionCol[k];

                    if (isValid(newRow, newCol, n) && grid[newRow][newCol] == 1) {
                        int newNode = (newRow * n) + newCol;
                        set.add(ds.find(newNode));
                    }
                }

                int size = 1;
                for (int node : set) {
                    size += ds.size[node];
                }

                largestIsland = Math.max(largestIsland, size);
            }
        }

        return largestIsland;
    }

    private boolean isValid(int row, int col, int n) {
        return row >= 0 && row < n && col >= 0 && col < n;
    }
}

class DisjointSet {
    private final int[] parent;
    public final int[] size;

    public DisjointSet(int n) {
        parent = new int[n + 1];
        size = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    public void union(int x, int y) {
        int parentOfX = find(x);
        int parentOfY = find(y);

        if (parentOfX == parentOfY) return; // belongs to same set

        if (size[parentOfX] < size[parentOfY]) {
            parent[parentOfX] = parentOfY;
            size[parentOfY] += size[parentOfX];
        } else {
            parent[parentOfY] = parentOfX;
            size[parentOfX] += size[parentOfY];
        }
    }
}
