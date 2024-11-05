# 17. Letter Combinations of a Phone Number

**Link**: [https://leetcode.com/problems/letter-combinations-of-a-phone-number/](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)

## Problem Statement

Given a string containing digits from `2` to `9` inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

![1200px-telephone-keypad2svg](https://github.com/user-attachments/assets/9389ba80-5ad7-4051-bec2-f07d52b671cd)

Note that:
- `1` does not map to any letters.
- If the input `digits` is empty, return an empty list.

## Examples

### Example 1

**Input**:
```
digits = "23"
```

**Output**:
```
["ad","ae","af","bd","be","bf","cd","ce","cf"]
```
### Example 2

**Input**:
```
digits = ""
```

**Output**:
```
[]
```

### Example 3

**Input**:
```
digits = "2"
```

**Output**:
```
["a","b","c"]
```


## Constraints

- `0 <= digits.length <= 4 `
- `digits[i]` is a digit in the range `['2', '9']`.

