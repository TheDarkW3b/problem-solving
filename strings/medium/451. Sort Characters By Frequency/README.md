# Sort Characters by Frequency

**Link**: [https://leetcode.com/problems/sort-characters-by-frequency/description/](https://leetcode.com/problems/sort-characters-by-frequency/description/)

### Problem Statement

Given a string `s`, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple valid answers, return any of them.

### Examples

#### Example 1:
- **Input**: `s = "tree"`
- **Output**: `"eert"`
- **Explanation**: 
  - 'e' appears twice, while 'r' and 't' both appear once.
  - Therefore, "eert" or "eetr" are valid answers.

#### Example 2:
- **Input**: `s = "cccaaa"`
- **Output**: `"aaaccc"`
- **Explanation**: 
  - Both 'c' and 'a' appear three times. "cccaaa" and "aaaccc" are valid answers.
  - Note that characters must be grouped together, so "cacaca" is incorrect.

#### Example 3:
- **Input**: `s = "Aabb"`
- **Output**: `"bbAa"`
- **Explanation**: 
  - 'A' and 'a' are treated as different characters. "bbAa" or "bbaA" are valid outputs.

### Constraints
- `1 <= s.length <= 5 * 10^5`
- `s` consists of uppercase and lowercase English letters and digits.
