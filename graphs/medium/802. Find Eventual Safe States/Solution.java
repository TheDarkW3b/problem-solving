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

        System.out.println(reversedGraph);
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
