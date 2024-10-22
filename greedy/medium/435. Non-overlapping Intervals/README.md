# 435. Non-overlapping Intervals

**Link**: [https://leetcode.com/problems/non-overlapping-intervals/](https://leetcode.com/problems/non-overlapping-intervals/)

## Problem Statement

Given an array of intervals `intervals` where `intervals[i] = [starti, endi]`, return the **minimum number of intervals** you need to remove to make the rest of the intervals non-overlapping.

Note that intervals which only touch at a point are non-overlapping. For example, `[1, 2]` and `[2, 3]` are non-overlapping.

## Examples

### Example 1:

**Input**: 
```
intervals = [[1,2],[2,3],[3,4],[1,3]]
```
**Output**:
```
1
```
  * **Explanation**: Removing `[1,3]` makes the rest of the intervals non-overlapping.

### Example 2:

**Input**: 
```
intervals = [[1,2],[1,2],[1,2]]
```
**Output**:
```
2
```
  * **Explanation**: You need to remove two `[1,2]` to make the rest non-overlapping.

### Example 3:

**Input**: 
```
intervals = [[1,2],[2,3]]
```
**Output**:
```
0
```
  * **Explanation**: No intervals need to be removed since they're already non-overlapping.

## Constraints:

- `1 <= intervals.length <= 10^5`
- `intervals[i].length == 2`
- `-5 * 10^4 <= starti < endi <= 5 * 10^4`
