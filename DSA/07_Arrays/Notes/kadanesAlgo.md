# 📘 Kadane's Algorithm

> **Difficulty:** ⭐⭐ Medium
> **Category:** Arrays
> **Language:** Java

---
# 📑 Table of Contents

- [Problem Statement](#1-problem-statement)
- [Why Do We Need Kadane's Algorithm?](#2-why-do-we-need-kadanes-algorithm)
- [Brute Force Approach](#3-brute-force-approach)
- [Better Approach (Prefix Sum)](#4-better-approach-prefix-sum)
- [Intuition Behind Kadane's Algorithm](#5-intuition-behind-kadanes-algorithm)
- [Key Insight](#6-key-insight)
- [Algorithm](#7-algorithm)
- [Dry Run](#8-dry-run)
- [Java Implementation](#9-java-implementation)
- [Time & Space Complexity](#10-time--space-complexity)
- [Common Mistakes](#11-common-mistakes)
- [Pattern Recognition](#12-pattern-recognition)
- [Interview Perspective](#13-interview-perspective)
- [Quick Revision](#14-quick-revision)
- [Practice Problems](#15-practice-problems)
- [What's Next?](#16-whats-next)

---

# 1. Problem Statement

Given an integer array, find the **maximum possible sum of a contiguous subarray**.

Example

```text
Array

2 -3 6 -5 4 2
```

Possible subarrays

```text
2

2 -3

6

6 -5

6 -5 4

6 -5 4 2

4 2
```

Maximum Sum

```text
7
```

obtained from

```text
6 -5 4 2
```

---

# 2. Why Do We Need Kadane's Algorithm?

Suppose the array contains

```text
100000 elements
```

Finding every subarray takes

```
O(n²)
```

or even

```
O(n³)
```

depending on the approach.

For such large inputs, these solutions become too slow.

Kadane's Algorithm solves the problem in

```
O(n)
```

using only one traversal.

---

# 3. Brute Force Approach

Generate every possible subarray.

Calculate its sum.

Keep track of the maximum.

Time Complexity

```
O(n³)
```

---

# 4. Better Approach

Using Prefix Sum,

every subarray sum can be calculated in

```
O(1)
```

But we still need to consider every possible subarray.

Overall Complexity

```
O(n²)
```

Can we do even better?

Yes.

---

# 5. Intuition Behind Kadane's Algorithm

Imagine you're walking while carrying a bag.

Every positive number adds money to the bag.

Every negative number removes money.

Suppose your bag becomes negative.

```text
Current Sum

-8
```

Should you continue carrying it?

No.

Starting fresh from the next element is always better.

That is the main idea behind Kadane's Algorithm.

---

# 6. Key Insight

> **A negative running sum can never increase the sum of a future subarray.**

If the current sum becomes negative,

discard it and start a new subarray.

This single observation reduces the complexity to **O(n)**.

---

# 7. Algorithm

1. Initialize

```java
currentSum = 0;
maxSum = Integer.MIN_VALUE;
```

2. Traverse the array.

3. Add the current element to `currentSum`.

4. Update `maxSum`.

5. If `currentSum` becomes negative,

reset it to

```java
0
```

6. Continue until the end.

---

# 8. Dry Run

Array

```text
-2 1 -3 4 -1 2 1 -5 4
```

| Element | Current Sum | Max Sum |
|---------:|------------:|---------:|
|-2|-2|-2|
|1|1|1|
|-3|-2|1|
|Reset|0|1|
|4|4|4|
|-1|3|4|
|2|5|5|
|1|6|6|
|-5|1|6|
|4|5|6|

Answer

```text
6
```

Subarray

```text
4 -1 2 1
```

---

# 9. Java Implementation

```java
int currentSum = 0;
int maxSum = Integer.MIN_VALUE;

for(int num : arr){

    currentSum += num;

    maxSum = Math.max(maxSum, currentSum);

    if(currentSum < 0){
        currentSum = 0;
    }

}

System.out.println(maxSum);
```

---

# 10. Time & Space Complexity

| Operation | Complexity |
|-----------|-----------:|
| Time | O(n) |
| Space | O(1) |

---

# 11. Common Mistakes

### ❌ Initializing `maxSum` to 0

Fails for

```text
-5 -2 -8
```

Correct

```java
Integer.MIN_VALUE
```

---

### ❌ Resetting before updating maximum

Wrong

```java
if(currentSum < 0)
    currentSum = 0;

maxSum = Math.max(maxSum,currentSum);
```

Update `maxSum` **before** resetting.

---

### ❌ Ignoring all-negative arrays

Classic Kadane fails if written carelessly.

Always test

```text
[-3,-2,-5]
```

---

# 12. Pattern Recognition

Think of Kadane's Algorithm when the problem mentions

- Maximum Subarray Sum
- Largest Contiguous Sum
- Maximum Profit Segment
- Maximum Running Sum

---

# 13. Interview Perspective

### Q1

Why do we reset the running sum?

Because a negative prefix only decreases the sum of any future subarray.

---

### Q2

Can Kadane's Algorithm solve Minimum Subarray Sum?

Yes.

Reverse the logic.

---

### Q3

Can Kadane return the actual subarray?

Yes.

Store

- Start index
- End index

while updating the answer.

---

### Q4

Can Kadane work on circular arrays?

Not directly.

A modified version is required.

---

# 14. Quick Revision

- Running Sum
- Reset if negative
- Update answer every iteration
- Time → O(n)
- Space → O(1)

---

# 15. Practice Problems

### Easy

- Maximum Subarray

### Medium

- Maximum Product Subarray
- Circular Maximum Subarray

### Hard

- Maximum Sum Rectangle
- Maximum Sum Submatrix

---

# 16. What's Next?

Kadane's Algorithm finds the maximum sum.

But what if we need to calculate **how much water is trapped between buildings after rainfall?**

The next chapter introduces the **Trapping Rain Water** problem, where we'll learn to precompute information from both the left and right sides of an array.
