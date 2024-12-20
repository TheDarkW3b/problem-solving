# GFG. Root to Leaf Paths
**Link**: [https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1](https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1)

## Problem Statement
Given a Binary Tree, you need to find all the possible paths from the root node to all the leaf nodes of the binary tree.

## Examples
### Example 1:

![image](https://github.com/user-attachments/assets/f882c364-b329-4ca1-9b6c-cc2eed044d9d)

**Input**:
```
root[] = [1, 2, 3, 4, 5]
```
**Output**:
```
[[1, 2, 4], [1, 2, 5], [1, 3]] 
```

  * **Explanation**: All possible paths: `1->2->4`, `1->2->5` and `1->3`.

### Example 2:

**Input**:
```
root[] = [1, 2, 3]
```
**Output**:
```
[[1, 2], [1, 3]] 
```

  * **Explanation**: All possible paths: `1->2` and `1->3`.

### Example 3:

**Input**:
```
root[] = [10, 20, 30, 40, 60]
```
**Output**:
```
[[10, 20, 40], [10, 20, 60], [10, 30]]
```

## Constraints:
- `1 <= number of nodes <= 104`
- `1 <= node->data <= 104`
