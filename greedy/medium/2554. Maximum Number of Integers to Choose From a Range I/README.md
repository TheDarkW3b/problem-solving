# 2554. Maximum Number of Integers to Choose From a Range I

**Link**: [https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/description](https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/description)

## Problem Statement

You are given:
- An integer array `banned`.
- Two integers `n` and `maxSum`.

You need to choose integers following these rules:
1. The integers must be in the range `[1, n]`.
2. Each integer can be chosen at most once.
3. The integers must not appear in `banned`.
4. The sum of the chosen integers should not exceed `maxSum`.

Return the **maximum number of integers** you can choose while satisfying all the conditions.

## Examples

### Example 1

**Input**:
```
banned = [1,6,5] n = 5 maxSum = 6
```

**Output**:
```
2
```

  * **Explanation**:
    - You can choose the integers `2` and `4`.
    - Both integers are in the range `[1, 5]`, are not in the `banned` array, and their sum is `6`, which does not exceed `maxSum`.

### Example 2

**Input**:
```
banned = [1,2,3,4,5,6,7] n = 8 maxSum = 1
```

**Output**:
```
0
```

  * **Explanation**:
    - You cannot choose any integer because all integers in the range `[1, 8]` are either banned or their sum would exceed `maxSum`.

### Example 3

**Input**:
```
banned = [11] n = 7 maxSum = 50
```

**Output**:
```
7
```

  * **Explanation**:
    - You can choose all integers in `[1, 7]`.
    - The total sum is `28`, which is less than or equal to `maxSum`, and none of these integers are banned.

## Constraints

- `1 <= banned.length <= 10^4`
- `1 <= banned[i], n <= 10^4`
- `1 <= maxSum <= 10^9`
