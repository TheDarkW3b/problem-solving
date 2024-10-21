class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (int num: arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        heap.addAll(map.keySet());

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;
    }
}
