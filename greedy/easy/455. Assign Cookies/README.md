# 455. Assign Cookies

**Link**: [https://leetcode.com/problems/assign-cookies/](https://leetcode.com/problems/assign-cookies/)

## Problem Statement

Assume you are an awesome parent and want to give your children some cookies. Each child i has a greed factor `g[i]`, which is the minimum size of a cookie that will satisfy the child. Each cookie j has a size `s[j]`. If `s[j] >= g[i]`, you can assign the cookie j to child i, making the child content.

Your goal is to maximize the number of content children and output the maximum number.

### Example 1:

**Input**: 
```
g = [1,2,3], s = [1,1]
```

**Output**: 
```
1
``` 
  * **Explanation**: You have `3` children and `2` cookies. The greed factors are `[1, 2, 3]`. You can only make the child with greed factor `1` content with the available cookies of size `1`.

### Example 2:

**Input**: 
```
g = [1,2], s = [1,2,3]
```

**Output**: 
```
2
``` 
  * **Explanation**: You have `2` children and `3` cookies. The greed factors are `[1, 2]`. You can satisfy both children with the available cookies.

### Constraints:

- `1 <= g.length <= 3 * 10^4`
- `0 <= s.length <= 3 * 10^4`
- `1 <= g[i], s[j] <= 2^31 - 1`
