// Optimised - Prefix Sum
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int n = words.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            String word = words[i];
            prefix[i + 1] = prefix[i] + (isVowelString(word, vowelSet) ? 1 : 0);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            ans[i] = prefix[end + 1] - prefix[start];
        }

        return ans;
    }

    private boolean isVowelString(String word, Set<Character> vowelSet) {
        return vowelSet.contains(word.charAt(0)) && vowelSet.contains(word.charAt(word.length() - 1));
    }
}

// Brute-force (TLE)
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Integer> vowels = new HashSet<>();
        Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (vowelSet.contains(word.charAt(0)) && vowelSet.contains(word.charAt(word.length() - 1))) {
                vowels.add(i);
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            int count = 0;

            for (int j = start; j <= end; j++) {
                if (vowels.contains(j)) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}
