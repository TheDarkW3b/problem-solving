class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for(char c : s.toCharArray())
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);

        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a, b) -> hashMap.get(b) - hashMap.get(a));
        priorityQueue.addAll(hashMap.keySet());

        StringBuilder stringBuilder = new StringBuilder();
        while (!priorityQueue.isEmpty()){
            char ch = priorityQueue.poll();
            stringBuilder.append(String.valueOf(ch).repeat(Math.max(0, hashMap.get(ch))));
        }
        return stringBuilder.toString();
    }
}
