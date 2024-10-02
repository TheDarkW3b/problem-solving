class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr) 
            heap.add(num);

        int previousElement = Integer.MIN_VALUE, rank  = 0;
        
        while(!heap.isEmpty()){
            int value = heap.poll();
            
            if(!(value == previousElement)) {
                map.put(value, ++rank);
                previousElement = value;
            }
        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
