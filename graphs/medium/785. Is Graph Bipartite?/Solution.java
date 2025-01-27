// OPTIMISED SOLUTION USING DFS AND OMITTING VISITED ARRAY
class Solution {
    public static boolean isBipartite(int[][] graph) {
        int V = graph.length;

        int[] color = new int[V];
        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!dfs(i, 0, color, graph)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean dfs(int i, int currentColor, int[] color, int[][] graph) {
        color[i] = currentColor;

        for (int neighbour : graph[i]) {
            if (color[neighbour] == -1) {
                if (!dfs(neighbour, 1 - currentColor, color, graph)) {
                    return false;
                }
            } else if (color[neighbour] == currentColor) {
                return false;
            }
        }

        return true;
    }
}

// -------------------------------------------------------------------------------------------------------------------

//INITIAL SOLUTION USING BFS
class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;

        boolean[] visited = new boolean[V];
        int[] color = new int[V];
        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (!bfs(i, visited, color, graph)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean bfs(int start, boolean[] visited, int[] color, int[][] graph) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        color[start] = 0;

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            int currentColor = color[poll];

            for (int neighbour : graph[poll]) {
                if (!visited[neighbour]) {
                    queue.add(neighbour);
                    color[neighbour] = 1 - currentColor;
                    visited[neighbour] = true;
                } else if (color[neighbour] == currentColor) {
                    return false;
                }
            }
        }

        return true;
    }
}
