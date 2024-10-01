class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int l = 0, r = 0;
        int size = s.length();

        Map<Character, Integer> map = new HashMap<>();

        while(r < size){
            char ch = s.charAt(r);
            
            if(map.containsKey(ch)){
                l = Math.max(l, map.get(ch) + 1);
            }

            map.put(ch, r);
            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }

        return maxLen;
    }
}
