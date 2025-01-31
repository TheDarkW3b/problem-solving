class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<List<Integer>>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] time : times) {
            int edgeFrom = time[0];
            int edgeTo = time[1];
            int weight = time[2];

            List<Integer> node = new ArrayList<>();
            node.add(edgeTo);
            node.add(weight);
            adj.get(edgeFrom).add(node);
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{k, 0}); // new int[node, time]

        while (!pq.isEmpty()) {
            int[] poll = pq.poll();
            int node = poll[0];

            for (List<Integer> neighbour : adj.get(node)) {
                int neighbourNode = neighbour.get(0);
                int neighbourWeight = neighbour.get(1);

                if (dist[node] + neighbourWeight < dist[neighbourNode]) {
                    dist[neighbourNode] = dist[node] + neighbourWeight;
                    pq.add(new int[]{neighbourNode, dist[neighbourNode]});
                }
            }
        }

        int maxWeight = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }
            maxWeight = Math.max(maxWeight, dist[i]);
        }

        return maxWeight;
    }
}
