# 142. Linked List Cycle II

**Link**: [https://leetcode.com/problems/linked-list-cycle-ii/](https://leetcode.com/problems/linked-list-cycle-ii/)

## Problem Statement

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return `null`.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, `pos` is used to denote the index of the node that the tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that `pos` is not passed as a parameter.


## Examples

### Example 1
![circularlinkedlist](https://github.com/user-attachments/assets/a8736c9b-ef43-4e1a-a18e-1106f8b23472)

**Input**:
```
head = [3,2,0,-4], pos = 1
```

**Output**:
```
tail connects to node index 1
```

  - **Explanation**: There is a cycle in the linked list, where the tail connects to the second node.

### Example 2
![circularlinkedlist_test2](https://github.com/user-attachments/assets/49ee31ce-ed10-4895-965c-e641d090184a)

**Input**:
```
head = [1,2], pos = 0
```

**Output**:
```
tail connects to node index 0
```

  - **Explanation**: There is a cycle in the linked list, where the tail connects to the first node.

### Example 3
![circularlinkedlist_test3](https://github.com/user-attachments/assets/b5df1250-226d-4849-a641-40750769d3b2)

**Input**:
```
head = [1], pos = -1
```

**Output**:
```
no cycle
```

  - **Explanation**: There is no cycle in the linked list.

## Constraints

- The list should not be modified.
- The number of the nodes in the list is in the range `[0, 10^4]`
- `-10^5 <= Node.val <= 10^5`
- `pos` is -1 or a valid index in the linked list.

## Follow-Up

Can you solve this problem using `(O(1)` (i.e., constant) memory?
