# 3379. Transformed Array

**Link**: [https://leetcode.com/problems/transformed-array/description/](https://leetcode.com/problems/transformed-array/description/)

## Problem Statement

You are given an integer array `nums` that represents a circular array. Your task is to create a new array `result` of the same size, following these rules:

1. For each index `i` (where `0 <= i < nums.length`), perform the following actions:
   - If `nums[i] > 0`: Start at index `i` and move `nums[i]` steps to the right in the circular array. Set `result[i]` to the value of the index where you land.
   - If `nums[i] < 0`: Start at index `i` and move `abs(nums[i])` steps to the left in the circular array. Set `result[i]` to the value of the index where you land.
   - If `nums[i] == 0`: Set `result[i]` to `nums[i]`.

2. Return the new array `result`.

**Note**: Since `nums` is circular, moving past the last element wraps around to the beginning, and moving before the first element wraps back to the end.

## Examples

### Example 1

**Input**:
```
nums = [3,-2,1,1]
```

**Output**:
```
[1,1,1,3]
```

  * **Explanation**:
    - For `nums[0] = 3`, move 3 steps right to `nums[3]`. So `result[0] = 1`.
    - For `nums[1] = -2`, move 2 steps left to `nums[3]`. So `result[1] = 1`.
    - For `nums[2] = 1`, move 1 step right to `nums[3]`. So `result[2] = 1`.
    - For `nums[3] = 1`, move 1 step right to `nums[0]`. So `result[3] = 3`.

### Example 2

**Input**:
```
nums = [-1,4,-1]
```

**Output**:
```
[-1,-1,4]
```

  * **Explanation**:
    - For `nums[0] = -1`, move 1 step left to `nums[2]`. So `result[0] = -1`.
    - For `nums[1] = 4`, move 4 steps right to `nums[2]`. So `result[1] = -1`.
    - For `nums[2] = -1`, move 1 step left to `nums[1]`. So `result[2] = 4`.

## Constraints

- `1 <= nums.length <= 100`
- `-100 <= nums[i] <= 100`

