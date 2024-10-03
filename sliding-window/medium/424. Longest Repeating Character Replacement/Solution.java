class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0, maxFreq = 0;
        int l = 0, r = 0;
        int size = s.length();
        Map<Character, Integer> map = new HashMap<>();

        while(r < size){
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));

            while(((r - l + 1) - maxFreq) > k){
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0) map.remove(leftChar);
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
