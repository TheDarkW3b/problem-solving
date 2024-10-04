# 992. Subarrays with K Different Integers

**Link**: [https://leetcode.com/problems/subarrays-with-k-different-integers/](https://leetcode.com/problems/subarrays-with-k-different-integers/)
## Problem Description

Given an integer array `nums` and an integer `k`, return the number of good subarrays of `nums`.
A **good subarray** is an array where the number of different integers is exactly `k`.
A **subarray** is a contiguous part of an array.

---

### Examples:

#### Example 1:
**Input**:  
`nums = [1,2,1,2,3], k = 2`

**Output**:  
`7`

**Explanation**:  
The subarrays that contain exactly 2 different integers are:
- `[1,2]`
- `[2,1]`
- `[1,2]`
- `[2,3]`
- `[1,2,1]`
- `[2,1,2]`
- `[1,2,1,2]`

#### Example 2:
**Input**:  
`nums = [1,2,1,3,4], k = 3`

**Output**:  
`3`

**Explanation**:  
The subarrays that contain exactly 3 different integers are:
- `[1,2,1,3]`
- `[2,1,3]`
- `[1,3,4]`

---

### Constraints:
- 1 <= nums.length <= 2 * 10^4
- 1 <= nums[i], k <= nums.length
