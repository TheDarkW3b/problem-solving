# 103. Binary Tree Zigzag Level Order Traversal
**Link**: [https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/)

## Problem Statement
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

## Examples
### Example 1:
![tree1](https://github.com/user-attachments/assets/12961ba9-1a3a-47f8-9aef-6cfefb2a58fe)

**Input**:
```
root = [3,9,20,null,null,15,7]
```
**Output**:
```
[[3],[20,9],[15,7]]
```

### Example 2:
**Input**:
```
root = [1]
```
**Output**:
```
[[1]]
```

### Example 3:
**Input**:
```
root = []
```
**Output**:
```
[]
```

## Constraints:
- The number of nodes in the tree is in the range `[0, 2000]`.
- `-100 <= Node.val <= 100`
