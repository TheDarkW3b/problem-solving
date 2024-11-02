# 38. Count and Say

**Link**: [https://leetcode.com/problems/count-and-say/](https://leetcode.com/problems/count-and-say/)

## Problem Statement

The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

- `countAndSay(1) = "1"`
- `countAndSay(n)` is the run-length encoding (RLE) of `countAndSay(n - 1)`.

Run-length encoding (RLE) is a string compression method where consecutive identical characters (repeated 2 or more times) are replaced by the concatenation of the count of characters and the character itself.

Given a positive integer `n`, return the nth element of the count-and-say sequence.

## Examples

### Example 1

**Input**:
```
n = 4
```
**Output**:
```
"1211"
```
**Explanation**:
```
countAndSay(1) = "1"
countAndSay(2) = RLE of "1" = "11"
countAndSay(3) = RLE of "11" = "21"
countAndSay(4) = RLE of "21" = "1211"
```

### Example 2

**Input**:
```
n = 1
```
**Output**:
```
"1"
```
**Explanation**:
This is the base case.

## Constraints

- `1 <= n <= 30`
