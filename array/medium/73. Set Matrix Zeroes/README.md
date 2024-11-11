# 73. Set Matrix Zeroes

**Link**: [https://leetcode.com/problems/set-matrix-zeroes/description/](https://leetcode.com/problems/set-matrix-zeroes/description/)

## Problem Statement

Given an `m x n` integer matrix `matrix`, if an element is `0`, set its entire row and column to `0`s.

You must do it in place.

### Example 1
![mat1](https://github.com/user-attachments/assets/3803fd30-970e-4012-a85f-98d5fc639067)

**Input**:
```
matrix = [[1,1,1],[1,0,1],[1,1,1]]
```

**Output**:
```
[[1,0,1],[0,0,0],[1,0,1]]
```

### Example 2
![mat2](https://github.com/user-attachments/assets/11985e8d-3a6b-4ba3-a8c6-18dfe9d24132)

**Input**:
```
matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
```

**Output**:
```
[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
```

## Constraints
- `m == matrix.length`
- `n == matrix[0].length`
- `1 <= m, n <= 200`
- `-2^31 <= matrix[i][j] <= 2^31 - 1`

## Follow-up
- A straightforward solution using `O(m * n)` space is probably a bad idea.
- A simple improvement uses `O(m + n)` space, but still not the best solution.
- Could you devise a constant space solution?
