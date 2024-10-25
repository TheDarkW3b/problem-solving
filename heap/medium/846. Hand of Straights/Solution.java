class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        while (!map.isEmpty()) {
            int current = map.firstKey();

            for (int i = 0; i < groupSize; i++) {
                int required = current + i;

                if (map.getOrDefault(required, 0) == 0) return false;

                map.put(required, map.get(required) - 1);

                if (map.get(required) == 0) map.remove(required);
            }
        }

        return true;
    }
}
