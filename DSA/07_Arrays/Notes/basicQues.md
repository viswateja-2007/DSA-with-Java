# 📘 Basic Array Problems

> **Difficulty:** ⭐ Easy
> **Category:** Arrays
> **Language:** Java

---

# 📑 Table of Contents

- [Introduction](#1-introduction)
- [What are Basic Array Problems?](#2-what-are-basic-array-problems)
- [Common Operations](#3-common-operations)
- [Largest Element](#4-largest-element)
- [Smallest Element](#5-smallest-element)
- [Reverse an Array](#6-reverse-an-array)
- [Check if Array is Sorted](#7-check-if-array-is-sorted)
- [Count Even & Odd Numbers](#8-count-even--odd-numbers)
- [Find Maximum & Minimum Difference](#9-find-maximum--minimum-difference)
- [Dry Run](#10-dry-run)
- [Time & Space Complexity](#11-time--space-complexity)
- [Common Mistakes](#12-common-mistakes)
- [Interview Perspective](#13-interview-perspective)
- [Pattern Recognition](#14-pattern-recognition)
- [Quick Revision](#15-quick-revision)
- [Practice Problems](#16-practice-problems)

---
# 1. Introduction

Before solving advanced array problems such as Prefix Sum, Kadane's Algorithm, or Sliding Window, it is important to master the basic operations on arrays.

Most interview questions are built upon these fundamentals.

If you can confidently solve these problems, learning advanced techniques becomes much easier.

---

# 2. What are Basic Array Problems?

Basic array problems involve performing simple operations on an array such as:

- Finding the maximum element
- Finding the minimum element
- Reversing an array
- Counting elements
- Checking if an array is sorted

Although these problems are simple, they teach important concepts like:

- Array traversal
- Loop construction
- Updating variables
- Edge case handling

---

# 3. Common Operations

| Operation | Complexity |
|-----------|-----------:|
| Traverse | O(n) |
| Find Maximum | O(n) |
| Find Minimum | O(n) |
| Reverse | O(n) |
| Check Sorted | O(n) |

---

# 4. Finding the Largest Element

## Idea

Assume the first element is the largest.

Traverse the array.

Whenever a larger element is found,

update the answer.

### Example

```text
4 7 2 9 5
```

```
Largest = 9
```

### Dry Run

| Element | Largest |
|---------|---------|
|4|4|
|7|7|
|2|7|
|9|9|
|5|9|

---

# 5. Finding the Smallest Element

Exactly the opposite.

Initialize

```java
smallest = Integer.MAX_VALUE;
```

Update whenever a smaller element appears.

---

# 6. Reverse an Array

## Approach

Use two pointers.

```text
1 2 3 4 5

↓

5 2 3 4 1

↓

5 4 3 2 1
```

One pointer starts from the beginning,

the other from the end.

Swap until they meet.

---

# 7. Check if Array is Sorted

Traverse the array.

If

```java
arr[i] > arr[i + 1]
```

the array is not sorted.

Otherwise,

it is sorted.

Example

```
1 2 3 4 5

Sorted
```

```
1 5 3 4

Not Sorted
```

---

# 8. Count Even & Odd Numbers

Traverse the array.

If

```java
arr[i] % 2 == 0
```

Even++

Else

Odd++

---

# 9. Find Maximum Difference

Example

```text
3 10 6 8

Maximum Difference

10 - 3 = 7
```

This teaches

- Maximum
- Minimum
- Updating variables

---

# 10. Dry Run

Array

```text
8 2 5 1 9
```

Finding Largest

|Iteration|Current|Largest|
|---------|------:|-------:|
|1|8|8|
|2|2|8|
|3|5|8|
|4|1|8|
|5|9|9|

Answer

```
9
```

---

# 11. Time & Space Complexity

| Problem | Time | Space |
|---------|------|-------|
|Largest|O(n)|O(1)|
|Smallest|O(n)|O(1)|
|Reverse|O(n)|O(1)|
|Check Sorted|O(n)|O(1)|

---

# 12. Common Mistakes

### Forgetting to initialize correctly

Wrong

```java
largest = 0;
```

Fails for

```text
-5 -3 -8
```

Correct

```java
Integer.MIN_VALUE
```

---

### Off-by-One Errors

Wrong

```java
i <= arr.length
```

Correct

```java
i < arr.length
```

---

### Reversing

Don't forget to move both pointers.

```java
left++;

right--;
```

---

# 13. Interview Perspective

### Frequently Asked

- Largest element
- Second largest
- Reverse array
- Sorted or not
- Missing number

These questions test

- Loop logic
- Edge cases
- Complexity analysis

---

# 14. Pattern Recognition

If the problem asks

- Largest
- Smallest
- Count
- Frequency

Think

> **Single Traversal**

Usually,

one loop is enough.

---

# 15. Quick Revision

✓ One traversal solves most basic problems.

✓ Initialize variables carefully.

✓ Always consider negative numbers.

✓ Two pointers are useful for reversing.

✓ Time complexity is usually O(n).

---

# 16. Practice Problems

### Easy

- Largest Element
- Smallest Element
- Reverse Array
- Check Sorted

### Medium

- Second Largest Element
- Leaders in an Array
- Remove Duplicates

### Hard

- Next Greater Element
- Product of Array Except Self
