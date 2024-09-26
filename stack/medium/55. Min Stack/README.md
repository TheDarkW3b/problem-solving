# 155. Min Stack

**Link**: [https://leetcode.com/problems/min-stack/description/](https://leetcode.com/problems/min-stack/description/)

### Problem Statement

Design a stack that supports the following operations in constant time:
- **push(val)**: Pushes the element `val` onto the stack.
- **pop()**: Removes the element on the top of the stack.
- **top()**: Gets the top element of the stack.
- **getMin()**: Retrieves the minimum element in the stack.

You must implement a solution with **O(1)** time complexity for each function.

### Examples

#### Example 1:
- **Input**: 
```
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]
```
- **Output**:
`[null,null,null,null,-3,null,0,-2]`
- **Explanation**: 
- `MinStack minStack = new MinStack();`
- `minStack.push(-2);` 
- `minStack.push(0);`
- `minStack.push(-3);`
- `minStack.getMin();` // returns -3 (minimum value in the stack)
- `minStack.pop();` // removes -3
- `minStack.top();` // returns 0 (current top element)
- `minStack.getMin();` // returns -2 (new minimum value)

### Constraints
- -2<sup>31</sup> <= `val` <= 2<sup>31</sup> - 1
- All operations (`pop`, `top`, `getMin`) will be called on non-empty stacks.
- At most 30,000 calls will be made to `push`, `pop`, `top`, and `getMin`.
