class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        int l = 0, r = 0;
        int count = 0;
        
        while(r < s.length()){
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            while(map.size() == 3 && l <= r){
                count += s.length() - r;
                
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                
                if(map.get(leftChar) == 0) map.remove(leftChar);
                l++;
            }
            r++;
        }
        
        return count;
    }
}
