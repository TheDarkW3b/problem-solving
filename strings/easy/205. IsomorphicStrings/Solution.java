class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Character> sHashMap = new HashMap<>();
        Map<Character, Character> tHashMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sHashMap.containsKey(sChar) && sHashMap.get(sChar) != tChar) return false;
            if(tHashMap.containsKey(tChar) && tHashMap.get(tChar) != sChar) return false;

            sHashMap.put(sChar, tChar);
            tHashMap.put(tChar, sChar);
        }
        return true;
    }
}
