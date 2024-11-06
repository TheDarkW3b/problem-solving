# 34. Find First and Last Position of Element in Sorted Array

**Link**: [https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/)

## Problem Statement:

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value. If the target is not found, return `[-1, -1]`. The algorithm should run with `O(log n)` complexity.

## Example 1:

**Input**:
```plaintext
nums = [5,7,7,8,8,10], target = 8
```
**Output**:
```plaintext
[3, 4]
```

## Example 2:

**Input**:
```plaintext
nums = [5,7,7,8,8,10], target = 6
```

**Output**:
```plaintext
[-1, -1]
```

## Constraints:
- `0 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`
- `nums` is a non-decreasing array.
- `-10^9 <= target <= 10^9`
