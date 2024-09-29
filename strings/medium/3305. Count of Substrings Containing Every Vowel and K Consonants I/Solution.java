class Solution {
    public int countOfSubstrings(String word, int k) {
        String vowels = "aeiou";
        int count = 0;
        
        for(int i = 0; i < word.length(); i++){
            int consonantCount = 0;
            Set<Character> set = new HashSet<>();

            for(int j = i; j < word.length(); j++){
                char ch = word.charAt(j);

                if(vowels.indexOf(ch) != -1){
                    set.add(ch);
                } else {
                    consonantCount++;
                    if(consonantCount > k) break;
                }
                
                if(set.size() == 5 && consonantCount == k)
                    count++;
            }
        }

        return count;
    }
}
