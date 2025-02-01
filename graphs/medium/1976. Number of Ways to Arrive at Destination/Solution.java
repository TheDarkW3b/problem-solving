class Solution {
    public static final int MOD = 1000000007;

    public int countPaths(int n, int[][] roads) {
        List<List<List<Integer>>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : roads) {
            int edgeFrom = edge[0];
            int edgeTo = edge[1];
            int weight = edge[2];

            adj.get(edgeFrom).add(List.of(edgeTo, weight));
            adj.get(edgeTo).add(List.of(edgeFrom, weight));
        }

        int[] ways = new int[n];
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        ways[0] = 1;

        PriorityQueue<long[]> queue = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
        queue.add(new long[]{0, 0}); // new int[] {node, distance}

        while (!queue.isEmpty()) {
            long[] poll = queue.poll();
            int node = (int) poll[0];
            long distance = poll[1];

            if (distance > dist[node]) continue;
            
            for (List<Integer> neighbour : adj.get(node)) {
                int neighbourNode = neighbour.get(0);
                long neighbourWeight = neighbour.get(1);

                if (dist[node] + neighbourWeight < dist[neighbourNode]) {
                    dist[neighbourNode] = dist[node]  + neighbourWeight;
                    queue.add(new long[]{neighbourNode, dist[neighbourNode]});
                    ways[neighbourNode] = ways[node];
                } else if (dist[node] + neighbourWeight == dist[neighbourNode]) {
                    ways[neighbourNode] = (ways[neighbourNode] + ways[node]) % MOD;
                }
            }
        }

        return (ways[n - 1]) % MOD;
    }
}
