class Solution {
    public long maxKelements(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : arr) heap.add(num);

        long ans = 0;

        while(k-- > 0){
            int value = heap.poll();
            ans += value;
            heap.add((int)Math.ceil(value / 3.0));
        }

        return ans;
    }
}
