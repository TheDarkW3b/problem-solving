# 151. Reverse Words in a String

**Link**: [https://leetcode.com/problems/reverse-words-in-a-string/](https://leetcode.com/problems/reverse-words-in-a-string/)

### Problem Statement

Given an input string `s`, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in `s` will be separated by at least one space.

Return a string of the words in reverse order, concatenated by a single space.

Note that `s` may contain leading or trailing spaces, or multiple spaces between two words. The returned string should only have a single space separating the words, and no extra spaces.

### Examples

#### Example 1:
- **Input**: `s = "the sky is blue"`
- **Output**: `"blue is sky the"`
- **Explanation**: The words are reversed, and separated by a single space.

#### Example 2:
- **Input**: `s = "  hello world  "`
- **Output**: `"world hello"`
- **Explanation**: The leading and trailing spaces are removed, and the words are reversed.

#### Example 3:
- **Input**: `s = "a good   example"`
- **Output**: `"example good a"`
- **Explanation**: Multiple spaces between words are reduced to a single space, and the words are reversed.

### Constraints

- `1 <= s.length <= 10^4`
- `s` contains English letters (upper-case and lower-case), digits, and spaces `' '`.
- There is at least one word in `s`.

### Notes

- The final string should not contain any leading or trailing spaces.
- There should only be one space between words in the returned string.
