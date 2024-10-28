# 3335. Total Characters in String After Transformations I

**Link**: [https://leetcode.com/problems/total-characters-in-string-after-transformations-i/](https://leetcode.com/problems/total-characters-in-string-after-transformations-i/)

## Problem Statement

You are given a string `s` and an integer `t`, representing the number of transformations to perform. In one transformation, every character in `s` is replaced according to the following rules:

1. If the character is `'z'`, replace it with the string `"ab"`.
2. Otherwise, replace it with the next character in the alphabet. For example, `'a'` becomes `'b'`, `'b'` becomes `'c'`, and so on.

Return the length of the resulting string after exactly `t` transformations.

Since the answer may be very large, return it modulo `10^9 + 7`.

## Examples

### Example 1

**Input**:
```
s = "abcyy", t = 2
```

**Output**:
```
7
```

**Explanation**:

- **First Transformation (t = 1)**:
    - `'a'` becomes `'b'`
    - `'b'` becomes `'c'`
    - `'c'` becomes `'d'`
    - `'y'` becomes `'z'`
    - `'y'` becomes `'z'`
    - String after the first transformation: `"bcdzz"`
  
- **Second Transformation (t = 2)**:
    - `'b'` becomes `'c'`
    - `'c'` becomes `'d'`
    - `'d'` becomes `'e'`
    - `'z'` becomes `"ab"`
    - `'z'` becomes `"ab"`
    - Final string after the second transformation: `"cdeabab"`

**Final Length**: The length of `"cdeabab"` is `7`.

### Example 2

**Input**:
```
s = "azbk", t = 1
```

**Output**:
```
5
```

**Explanation**:

- **First Transformation (t = 1)**:
    - `'a'` becomes `'b'`
    - `'z'` becomes `"ab"`
    - `'b'` becomes `'c'`
    - `'k'` becomes `'l'`
    - Final string after the transformation: `"babcl"`

**Final Length**: The length of `"babcl"` is `5`.

## Constraints

- `1 <= s.length <= 10^5`
- `s` consists only of lowercase English letters.
- `1 <= t <= 10^5`
