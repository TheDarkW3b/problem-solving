# 678. Valid Parenthesis String

**Link**: [https://leetcode.com/problems/valid-parenthesis-string/](https://leetcode.com/problems/valid-parenthesis-string/)

## Problem Statement

Given a string `s` containing only three types of characters: `'('`, `')'`, and `'*'`, return `true` if `s` is valid.

### Rules:

1. Any left parenthesis `'('` must have a corresponding right parenthesis `')'`.
2. Any right parenthesis `')'` must have a corresponding left parenthesis `'('`.
3. Left parenthesis `'('` must go before the corresponding right parenthesis `')'`.
4. The character `'*'` could be treated as:
   - A single right parenthesis `')'`, or 
   - A single left parenthesis `'('`, or
   - An empty string `""`.

## Examples

### Example 1:

**Input**: 
```
s = "()"
```
**Output**: 
```
true
```

### Example 2:

**Input**: 
```
s = "(*)""
```
**Output**: 
```
true
```

### Example 3:

**Input**: 
```
s = "(*))"
```
**Output**: 
```
true
```
## Constraints:
- `1 <= s.length <= 100`
- `s[i]` is either `'('`, `')'`, or `'*'`.
