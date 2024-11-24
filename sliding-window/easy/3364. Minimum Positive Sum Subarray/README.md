# 3364. Minimum Positive Sum Subarray

**Link**: [https://leetcode.com/problems/minimum-positive-sum-subarray/description/](https://leetcode.com/problems/minimum-positive-sum-subarray/description/)

## Problem Statement

You are given an integer array `nums` and two integers `l` and `r`. Your task is to find the **minimum sum** of a subarray whose size is between `l` and `r` (inclusive) and whose sum is greater than `0`.

Return the minimum sum of such a subarray. If no such subarray exists, return `-1`.

---

### Definitions:
- A subarray is a **contiguous non-empty sequence** of elements within an array.

## Examples

### Example 1

**Input**:
```
nums = [3, -2, 1, 4], l = 2, r = 3
```

**Output**:
```
1
```

  * **Explanation**:
    - Subarrays of length between `l = 2` and `r = 3` with a sum greater than `0` are:
      - `[3, -2]` → Sum: `1`
      - `[1, 4]` → Sum: `5`
      - `[3, -2, 1]` → Sum: `2`
      - `[-2, 1, 4]` → Sum: `3`
    - The minimum positive sum is `1`.


### Example 2

**Input**:
```
nums = [-2, 2, -3, 1], l = 2, r = 3
```

**Output**:
```
1
```
  
  * **Explanation**:
    - There is no subarray of length between `l` and `r` with a sum greater than `0`.

### Example 3

**Input**:
```
nums = [1, 2, 3, 4], l = 2, r = 4
```

**Output**:
```
3
```

  * **Explanation**:
    - Subarrays of length between `l = 2` and `r = 4` with a sum greater than `0` are:
      - `[1, 2]` → Sum: `3`
      - `[2, 3]` → Sum: `5`
      - `[3, 4]` → Sum: `7`
      - `[1, 2, 3]` → Sum: `6`
      - `[2, 3, 4]` → Sum: `9`
      - `[1, 2, 3, 4]` → Sum: `10`
    - The minimum positive sum is `3`.

## Constraints

- `1 <= nums.length <= 100`
- `1 <= l <= r <= nums.length`
- `-1000 <= nums[i] <= 1000`
