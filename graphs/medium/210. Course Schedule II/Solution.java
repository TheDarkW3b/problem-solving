class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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

        int[] ans = new int[numCourses];
        int i = 0;
        
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            ans[i++] = poll;

            for (int neighbour : adj.get(poll)) {
                indegrees[neighbour]--;

                if (indegrees[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }

        return i == numCourses ? ans : new int[]{};
    }
}
