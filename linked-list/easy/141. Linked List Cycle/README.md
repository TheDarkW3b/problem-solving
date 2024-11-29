# 141. Linked List Cycle

**Link**: [https://leetcode.com/problems/linked-list-cycle/description/](https://leetcode.com/problems/linked-list-cycle/description/)

## Problem Statement:

Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, `pos` is used to denote the index of the node that tail's next pointer is connected to. Note that `pos` is not passed as a parameter.

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

### Example 1:
![circularlinkedlist](https://github.com/user-attachments/assets/616b763a-c3ec-4a7b-a6d1-d37cac83e976)

**Input**: 
```
head = [3,2,0,-4], pos = 1
```
**Output**: 
```
true
```
  * **Explanation**: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

### Example 2:
![circularlinkedlist_test2](https://github.com/user-attachments/assets/6cc6641b-992d-4215-a71b-06444a0eb6aa)

**Input**:
```
head = [3,2,0,-4], pos = 1
```
**Output**: 
```
true
```
  * **Explanation**: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

### Example 3:
![circularlinkedlist_test3](https://github.com/user-attachments/assets/2e1aad08-7da3-48fe-93d6-2cfdb21814d1)

**Input**:
```
head = [3,2,0,-4], pos = 1
```
**Output**: 
```
true
```
  * **Explanation**: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

## Constraints:
- The number of the nodes in the list is in the range `[0, 10⁴]`.
- `-10⁵ <= Node.val <= 10⁵`.
- `pos` is `-1` or a valid index in the linked-list.

### Follow-up:
Can you solve it using `O(1)` (i.e., constant) memory?
