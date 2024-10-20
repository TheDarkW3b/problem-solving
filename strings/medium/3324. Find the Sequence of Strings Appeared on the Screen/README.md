# 3324. Find the Sequence of Strings Appeared on the Screen

**Link**: [https://leetcode.com/problems/find-the-sequence-of-strings-appeared-on-the-screen/](https://leetcode.com/problems/find-the-sequence-of-strings-appeared-on-the-screen/)

## Problem Statement

You are given a string `target`.

Alice is going to type `target` on her computer using a special keyboard that has only two keys:

- **Key 1** appends the character "a" to the string on the screen.
- **Key 2** changes the last character of the string on the screen to its next character in the English alphabet (e.g., "c" changes to "d" and "z" changes to "a").

Note that initially there is an empty string `""` on the screen, so Alice can only press key 1.

Return a list of all strings that appear on the screen as Alice types `target`, in the order they appear, using the minimum key presses.

## Examples

### Example 1:

**Input**: 
```
target = "abc"
```
**Output**: 
```
["a","aa","ab","aba","abb","abc"]
```
  * **Explanation**: The sequence of key presses done by Alice are:
    1. Press **key 1**, and the string on the screen becomes `"a"`.
    2. Press **key 1**, and the string on the screen becomes `"aa"`.
    3. Press **key 2**, and the string on the screen becomes `"ab"`.
    4. Press **key 1**, and the string on the screen becomes `"aba"`.
    5. Press **key 2**, and the string on the screen becomes `"abb"`.
    6. Press **key 2**, and the string on the screen becomes `"abc"`.

### Example 2:

**Input**: 
```
target = "he"
```
**Output**: 
```
["a","b","c","d","e","f","g","h","ha","hb","hc","hd","he"]
```

### Constraints:

- `1 <= target.length <= 400`
- `target` consists only of lowercase English letters.
