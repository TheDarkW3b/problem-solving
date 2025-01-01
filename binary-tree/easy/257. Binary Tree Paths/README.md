# 257. Binary Tree Paths
**Link**: [https://leetcode.com/problems/binary-tree-paths/description/](https://leetcode.com/problems/binary-tree-paths/description/)

## Problem Statement
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

## Examples

### Example 1:
![paths-tree](https://github.com/user-attachments/assets/04ecd927-0e12-4994-b43f-bc991577104a)

**Input**:
```
root = [1,2,3,null,5]
```
**Output**:
```
["1->2->5","1->3"]
```

### Example 2:
**Input**:
```
root = [1]
```
**Output**:
```
["1"]
```

## Constraints:
- The number of nodes in the tree is in the range `[1, 100]`.
- `-100 <= Node.val <= 100`
