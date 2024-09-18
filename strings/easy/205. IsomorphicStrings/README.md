# 205. Isomorphic Strings

**Link**: [https://leetcode.com/problems/isomorphic-strings/description/](https://leetcode.com/problems/isomorphic-strings/description/)

### Problem Statement

Given two strings `s` and `t`, determine if they are isomorphic.

Two strings are **isomorphic** if the characters in `s` can be replaced to get `t`. 

- All occurrences of a character must be replaced with another character while preserving the order of characters.
- No two characters may map to the same character, but a character may map to itself.

### Examples

#### Example 1:
- **Input**: `s = "egg"`, `t = "add"`
- **Output**: `true`
- **Explanation**: 
  - The strings `s` and `t` can be made identical by mapping `'e'` to `'a'` and `'g'` to `'d'`.

#### Example 2:
- **Input**: `s = "foo"`, `t = "bar"`
- **Output**: `false`
- **Explanation**: 
  - The strings `s` and `t` cannot be made identical as `'o'` needs to be mapped to both `'a'` and `'r'`.

#### Example 3:
- **Input**: `s = "paper"`, `t = "title"`
- **Output**: `true`
- **Explanation**: 
  - The strings `s` and `t` can be made identical by mapping `'p'` to `'t'`, `'a'` to `'i'`, `'p'` to `'t'`, `'e'` to `'l'`, and `'r'` to `'e'`.

### Constraints
- `1 <= s.length <= 5 * 10^4`
- `t.length == s.length`
- `s` and `t` consist of any valid ASCII character.
