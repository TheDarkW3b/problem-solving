# Leetcode - 1358. Number of Substrings Containing All Three Characters

**Link**: [https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/)

## Problem Description

Given a string `s` consisting only of characters `'a'`, `'b'`, and `'c'`, return the number of substrings containing at least one occurrence of all three characters.

---

### Examples:

#### Example 1:
**Input**:  
`s = "abcabc"`

**Output**:  
`10`

**Explanation**:  
The substrings containing at least one occurrence of `'a'`, `'b'`, and `'c'` are:
- `"abc"`
- `"abca"`
- `"abcab"`
- `"abcabc"`
- `"bca"`
- `"bcab"`
- `"bcabc"`
- `"cab"`
- `"cabc"`
- `"abc"` (appearing again)

#### Example 2:
**Input**:  
`s = "aaacb"`

**Output**:  
`3`

**Explanation**:  
The substrings containing at least one occurrence of `'a'`, `'b'`, and `'c'` are:
- `"aaacb"`
- `"aacb"`
- `"acb"`

#### Example 3:
**Input**:  
`s = "abc"`

**Output**:  
`1`

**Explanation**:  
The only substring containing all three characters is `"abc"`.

---

## Constraints:
- 3 <= s.length <= 5 x 10^4
- `s` only consists of characters `'a'`, `'b'`, or `'c'`.
