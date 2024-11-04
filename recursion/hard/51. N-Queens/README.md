# 51. N-Queens

**Link**: [https://leetcode.com/problems/n-queens/](https://leetcode.com/problems/n-queens/)

## Problem Statement

The N-Queens puzzle involves placing `n` queens on an `n x n` chessboard so that no two queens attack each other. This means:
1. No two queens should share the same row, column, or diagonal.

Given an integer `n`, return all distinct solutions to the N-Queens puzzle. Each solution should include a distinct board configuration, where:
- `'Q'` represents a queen.
- `'.'` represents an empty space.

## Examples

### Example 1
![queens](https://github.com/user-attachments/assets/432830d5-a98a-48ca-9bd4-01b7030e63ef)

**Input**:
```
n = 4
```

**Output**:
```
[ [".Q..", "...Q", "Q...", "..Q."],

["..Q.", "Q...", "...Q", ".Q.."] ]
```


**Explanation**: There are two distinct solutions to the 4-queens puzzle.

### Example 2

**Input**:
```
n = 1
```

**Output**:
```
[["Q"]]
```


## Constraints

- `1 <= n <= 9`

