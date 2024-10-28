// FREQUENCY ARRAY
class Solution {
    private static final int MOD = 1000000007;
    
    public int lengthAfterTransformations(String s, int t) {
        long[] frequencyMap = new long[26];

        for (char ch : s.toCharArray()) {
            frequencyMap[ch - 'a']++;
        }

        while (t-- > 0) {
            long[] tempMap = new long[26];

            for (int i = 0; i < 26; i++) {
                if (i == 25) {
                    tempMap[0] = (tempMap[0] + frequencyMap[i]) % MOD;
                    tempMap[1] = (tempMap[1] + frequencyMap[i]) % MOD;
                } else {
                    tempMap[i + 1] = (tempMap[i + 1] + frequencyMap[i]) % MOD;
                }
            }

            frequencyMap = tempMap;
        }

        long length = 0;
        for (long count : frequencyMap) {
            length = (length + count) % MOD;
        }

        return (int) length;
    }
}

// TLE ON MAP SOLUTION
class Solution {
    private static final int MOD = 1000000007;

    public int lengthAfterTransformations(String s, int t) {
        Map<Character, Long> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0L) + 1);
        }

        while (t-- > 0) {
            Map<Character, Long> tempMap = new HashMap<>();

            for (Map.Entry<Character, Long> entry : map.entrySet()) {
                char character = entry.getKey();
                long count = entry.getValue();

                if (character == 'z') {
                    tempMap.put('a', (tempMap.getOrDefault('a', 0L) + count) % MOD);
                    tempMap.put('b', (tempMap.getOrDefault('b', 0L) + count) % MOD);
                } else if (character == 'y') {
                    tempMap.put('z', (tempMap.getOrDefault('z', 0L) + count) % MOD);
                } else {
                    char nextChar = (char) (character + 1);
                    tempMap.put(nextChar, (tempMap.getOrDefault(nextChar, 0L) + count) % MOD);
                }
            }

            map = tempMap;
        }

        long length = 0;
        for (long count : map.values()) {
            length = (length + count) % MOD;
        }

        return (int) length;
    }
}
