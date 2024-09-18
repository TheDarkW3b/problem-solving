class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character, Integer> hashMap = new HashMap<>();

       for(char c : s.toCharArray())
           hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);

        for(char c : t.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0) - 1);
            if(hashMap.get(c) == 0) hashMap.remove(c);
        }

        return hashMap.isEmpty();
    }
}
