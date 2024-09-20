class Solution {
    public int beautySum(String s) {
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            Map<Character, Integer> map = new HashMap<>();
            for(int j = i; j < s.length(); j++){
                char subChar = s.charAt(j);
                map.put(subChar, map.getOrDefault(subChar, 0) + 1);

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for(int value : map.values()){
                    min = Math.min(min, value);
                    max = Math.max(max, value);
                }

                sum += max - min;
            }
        }
        
        return sum;
    }
}
