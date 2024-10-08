# 2095. Delete the Middle Node of a Linked List

**Link**: [https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/)

## Problem Statement

You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
The middle node of a linked list of size `n` is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to `x`.
For `n = 1, 2, 3, 4, 5`, the middle nodes are 0, 1, 1, 2, and 2, respectively.

### Example 1:
![eg1drawio](https://github.com/user-attachments/assets/a5d30727-28ca-4787-979d-405219a13ca3)

**Input**: head = [1,3,4,7,1,2,6]  
**Output**: [1,3,4,1,2,6]  
**Explanation**:  
Since n = 7, node 3 with value 7 is the middle node. We return the new list after removing this node.

### Example 2:
![eg2drawio](https://github.com/user-attachments/assets/08d43d82-0a4e-499a-8af1-1e8b007c52d5)

**Input**: head = [1,2,3,4]  
**Output**: [1,2,4]  
**Explanation**:  
For n = 4, node 2 with value 3 is the middle node.

### Example 3:
![eg3drawio](https://github.com/user-attachments/assets/7b199f84-f9a6-488c-9c08-0d2a70d9b06d)

**Input**: head = [2,1]  
**Output**: [2]  
**Explanation**:  
For n = 2, node 1 with value 1 is the middle node. After removing it, only node 0 with value 2 remains.

### Constraints:

- The number of nodes in the list is in the range `[1, 10^5]`.
- `1 <= Node.val <= 10^5`
