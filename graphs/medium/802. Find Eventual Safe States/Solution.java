// Optimised DFS (Single array for making both visited, pathVisited and safe nodes)
class Solution {
        public static List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;

        int[] state = new int[V];

        List<Integer> safeNodes = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            // Unvisited
            if (state[i] == 0) {
                dfs(i, state, graph);
            }

            // Safe node
            if (state[i] == 2) {
                safeNodes.add(i);
            }
        }

        return safeNodes;
    }

    private static boolean dfs(int i, int[] state, int[][] graph) {
        if (state[i] == 1) {
            // cycle
            return true;
        }

        if (state[i] == 2) {
            // safe node
            return false;
        }

        state[i] = 1;

        for (int neighbour : graph[i]) {
            if (dfs(neighbour, state, graph)) {
                return true;
            }
        }

        state[i] = 2;
        return false;
    }
}

// --------------------------------------------------------------------------------------------------------

// BFS (BEATS 5% BUT SIMPLE)
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;

        List<List<Integer>> reversedGraph = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            reversedGraph.add(new ArrayList<>());
        }

        int[] indegree = new int[V];

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                reversedGraph.get(graph[i][j]).add(i);
                indegree[i]++;
            }

        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> safeNodes = new ArrayList<>();

        while (!queue.isEmpty()) {
            int node = queue.poll();
            safeNodes.add(node);

            for (int neighbour : reversedGraph.get(node)) {
                indegree[neighbour]--;

                if (indegree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }

        Collections.sort(safeNodes);

        return safeNodes;
    }
}
