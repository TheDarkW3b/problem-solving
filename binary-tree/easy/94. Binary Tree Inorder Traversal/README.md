# 94. Binary Tree Inorder Traversal
**Link**: [https://leetcode.com/problems/binary-tree-inorder-traversal/description/](https://leetcode.com/problems/binary-tree-inorder-traversal/description/)

## Problem Statement
Given the root of a binary tree, return the inorder traversal of its nodes' values.

## Examples
### Example 1:

![screenshot-2024-08-29-202743](https://github.com/user-attachments/assets/2f7f6299-c524-4f3a-b764-35a8ead3e1ea)

**Input**:
```
root = [1,null,2,3]
```
**Output**:
```
[1,3,2]
```

### Example 2:

![tree_2](https://github.com/user-attachments/assets/30f61e3d-40dd-4fef-8af5-5a5f2d78208c)

**Input**:
```
root = [1,2,3,4,5,null,8,null,null,6,7,9]
```
**Output**:
```
[4,2,6,5,7,1,3,9,8]
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

### Example 4:
**Input**:
```
root = [1]
```
**Output**:
```
[1]
```

## Constraints:
- The number of nodes in the tree is in the range `[0, 100]`.
- `-100 <= Node.val <= 100`

## Follow-up:
Recursive solution is trivial. Could you do it iteratively?
