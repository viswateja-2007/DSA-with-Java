# 📘 Subarrays

> **Difficulty:** ⭐ Easy–Medium
> **Category:** Arrays
> **Language:** Java

---

# 📑 Table of Contents

- [What is a Subarray?](#1-what-is-a-subarray)
- [Subarray vs Subsequence](#2-subarray-vs-subsequence)
- [Total Number of Subarrays](#3-total-number-of-subarrays)
- [Generating All Subarrays](#4-generating-all-subarrays)
- [Dry Run](#5-dry-run)
- [Java Implementation](#6-java-implementation)
- [Time & Space Complexity](#7-time--space-complexity)
- [Common Mistakes](#8-common-mistakes)
- [Pattern Recognition](#9-pattern-recognition)
- [Interview Perspective](#10-interview-perspective)
- [Quick Revision](#11-quick-revision)
- [Practice Problems](#12-practice-problems)

---

# 1. What is a Subarray?

A **subarray** is a **continuous (contiguous)** part of an array.

Consider the array:

```text
[1, 2, 3, 4]
```

Examples of valid subarrays:

```text
[1]

[2]

[3]

[4]

[1, 2]

[2, 3]

[3, 4]

[1, 2, 3]

[2, 3, 4]

[1, 2, 3, 4]
```

Notice that every element appears **continuously**.

---

## Invalid Subarrays

```text
[1, 3]

[2, 4]

[1, 4]
```

These are **not** subarrays because the elements are **not adjacent**.

---

# 2. Subarray vs Subsequence

This is one of the most common interview questions.

| Subarray | Subsequence |
|----------|-------------|
| Continuous | Not necessarily continuous |
| Order preserved | Order preserved |
| Adjacent elements | Can skip elements |

Example

Array

```text
1 2 3 4
```

Subarray

```text
2 3
```

✅ Valid

Subsequence

```text
1 3 4
```

✅ Valid

Subarray

```text
1 3
```

❌ Invalid

---

# 3. Total Number of Subarrays

For an array of size **n**

Number of subarrays

```
n × (n + 1)

──────────────

      2
```

### Example

Array size

```
4
```

Total subarrays

```
4 × 5

────── = 10

  2
```

---

### Why?

Starting index

```
0

1

2

3
```

Possible subarrays

```
4

3

2

1
```

Total

```
4 + 3 + 2 + 1 = 10
```

which becomes

```
n(n+1)/2
```

---

# 4. Generating All Subarrays

The idea is simple.

Choose

- Start index

Then

- End index

Print everything in between.

This requires **three loops**.

```java
for(int start = 0; start < n; start++){

    for(int end = start; end < n; end++){

        for(int i = start; i <= end; i++){

            System.out.print(arr[i] + " ");

        }

        System.out.println();

    }

}
```

---

# 5. Dry Run

Array

```text
1 2 3
```

### Start = 0

```
1

1 2

1 2 3
```

### Start = 1

```
2

2 3
```

### Start = 2

```
3
```

Total

```
6
```

---

### Visualization

```text
Array

1 2 3

^

Start

↓

End

1

↓

1 2

↓

1 2 3
```

---

# 6. Java Implementation

```java
for(int i = 0; i < n; i++){

    for(int j = i; j < n; j++){

        for(int k = i; k <= j; k++){

            System.out.print(arr[k] + " ");

        }

        System.out.println();

    }

}
```

### Understanding the Loops

Outer loop

```
Choose starting index
```

Middle loop

```
Choose ending index
```

Inner loop

```
Print elements
```

---

# 7. Time & Space Complexity

Generating all subarrays

Time

```
O(n³)
```

Reason

- Start loop
- End loop
- Printing loop

Space

```
O(1)
```

---

# 8. Common Mistakes

### ❌ Confusing Subarray with Subsequence

Remember

Subarrays are always contiguous.

---

### ❌ Incorrect Inner Loop

Wrong

```java
k < j
```

Correct

```java
k <= j
```

Otherwise the last element of every subarray is skipped.

---

### ❌ Wrong End Loop

Wrong

```java
j = 0
```

Correct

```java
j = i
```

Otherwise duplicate subarrays are generated.

---

# 9. Pattern Recognition

If the problem asks

- Every possible subarray
- Maximum subarray
- Minimum subarray
- Sum of every subarray
- Number of subarrays

Think

> **Subarray Pattern**

---

# 10. Interview Perspective

### Frequently Asked Questions

**Q1.**

How many subarrays exist in an array of size n?

Answer

```
n(n+1)/2
```

---

**Q2.**

Can every subsequence be a subarray?

No.

A subsequence may skip elements.

---

**Q3.**

Why does generating all subarrays take O(n³)?

Because

- choosing start → O(n)
- choosing end → O(n)
- printing elements → O(n)

Total

```
O(n³)
```

---

# 11. Quick Revision

✓ Subarrays are contiguous.

✓ Total subarrays = n(n+1)/2.

✓ Three loops generate all subarrays.

✓ Time → O(n³).

✓ Space → O(1).

---

# 12. Practice Problems

### Easy

- Print all subarrays
- Count subarrays

### Medium

- Maximum Subarray Sum
- Minimum Subarray Sum

### Hard

- Subarray Sum Equals K
- Maximum Product Subarray
- Continuous Subarray Sum
