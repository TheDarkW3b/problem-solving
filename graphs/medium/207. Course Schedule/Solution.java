class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        int[] indegrees = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            int edgeFrom = edge[1];
            int edgeTo = edge[0];

            adj.get(edgeFrom).add(edgeTo);
            indegrees[edgeTo]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegrees[i] == 0) {
                queue.add(i);
            }
        }

        int count = 0;

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            count++;

            for (int neighbour : adj.get(poll)) {
                indegrees[neighbour]--;

                if (indegrees[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }

        return count == numCourses;
    }
}
