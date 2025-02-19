// Optimised Recursion
class Solution {
    public static String getHappyString(int n, int k) {
        int[] count = {0};
        String[] ans = {""};
        char[] choices = {'a', 'b', 'c'};

        generateHappyString(n, new StringBuilder(), choices, k, count, ans);

        return ans[0];
    }

    private static void generateHappyString(int n, StringBuilder sb, char[] choices, int k, int[] count, String[] ans) {
        if (sb.length() == n) {
            count[0]++;
            if (count[0] == k) {
                ans[0] = sb.toString();
            }
            return;
        }

        for (char ch : choices) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) continue;

            sb.append(ch);
            generateHappyString(n, sb, choices, k, count, ans);
            sb.deleteCharAt(sb.length() - 1);

            if (!ans[0].isEmpty()) return;
        }
    }
}

// Initial BruteForce
class Solution {
    public static String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'b', 'c'));

        getHappyString(0, n, set, new StringBuilder(), happyStrings);
      
        return happyStrings.size() >= k ? happyStrings.get(k - 1) : "";
    }

    private static void getHappyString(int index, int n, Set<Character> set, StringBuilder stringBuilder, List<String> happyStrings) {
        if (index == n) {
            happyStrings.add(stringBuilder.toString());
            return;
        }

        for (char ch : set) {
            if (index > 0 && stringBuilder.charAt(index - 1) == ch) continue;
            getHappyString(index + 1, n, set, stringBuilder.append(ch), happyStrings);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
