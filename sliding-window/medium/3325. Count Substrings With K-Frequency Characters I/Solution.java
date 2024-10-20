class Solution {
    public int numberOfSubstrings(String s, int k) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        int l = 0, r = 0, len = s.length();

        while (r < len) {
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.getOrDefault(ch, 0) >= k && l <= r) {
                count += len - r;

                char leftChar = s.charAt(l++);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) map.remove(leftChar);
            }

            r++;
        }

        return count;
    }
}
