# 860. Lemonade Change

**Link**: [https://leetcode.com/problems/lemonade-change/](https://leetcode.com/problems/lemonade-change/)

## Problem Statement

At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and will pay with either a $5, $10, or $20 bill. You must provide the correct change to each customer.

Given an integer array `bills` where `bills[i]` is the bill the ith customer pays, return `true` if you can provide every customer with the correct change, or `false` otherwise.

### Example 1:

**Input**: 
```
bills = [5,5,5,10,20]
```

**Output**: 
```
true
``` 
  * **Explanation**:
    * From the first 3 customers, we collect three $5 bills.
    * From the fourth customer, we collect a $10 bill and give back a $5.
    * From the fifth customer, we give back a $10 bill and a $5 bill. Since all customers got correct change, the answer is true.
   
      
### Example 2:

**Input**: 
```
bills = [5,5,10,10,20]
```

**Output**: 
```
false
``` 
  * **Explanation**:
    * From the first two customers, we collect two $5 bills.
    * For the next two customers, we collect two $10 bills and give back $5 bills.
    * For the last customer, we cannot give $15 back because we only have two $10 bills. Hence, the answer is false.
 
### Constraints:

- `1 <= bills.length <= 10^5`
- `bills[i]` is either `5`, `10`, or `20`.
  
