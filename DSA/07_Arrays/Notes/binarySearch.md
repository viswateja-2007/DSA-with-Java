# 📘 Binary Search

> **Difficulty:** ⭐⭐ Easy
> **Category:** Searching
> **Language:** Java
> **Prerequisite:** Arrays, Linear Search

---
# 📑 Table of Contents

- [What is Binary Search?](#1-what-is-binary-search)
- [Why Do We Need Binary Search?](#2-why-do-we-need-binary-search)
- [Prerequisites](#3-prerequisites)
- [Linear Search vs Binary Search](#4-linear-search-vs-binary-search)
- [Intuition](#5-intuition)
- [How Binary Search Works](#6-how-binary-search-works)
- [Algorithm](#7-algorithm)
- [Dry Run](#8-dry-run)
- [Java Implementation](#9-java-implementation)
- [Time & Space Complexity](#10-time--space-complexity)
- [Common Mistakes](#11-common-mistakes)
- [Pattern Recognition](#12-pattern-recognition)
- [Interview Perspective](#13-interview-perspective)
- [Quick Revision](#14-quick-revision)
- [Practice Problems](#15-practice-problems)

---

# 1. What is Binary Search?

Binary Search is an efficient searching algorithm that finds an element in a **sorted array** by repeatedly dividing the search space into two halves.

Instead of checking every element one by one, Binary Search eliminates half of the remaining elements after each comparison.

---

# 2. Why Do We Need Binary Search?

Suppose we have the following sorted array.

```text
[2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
```

Find

```
72
```

### Linear Search

Checks

```
2

5

8

12

16

23

38

56

72
```

Total comparisons

```
9
```

---

### Binary Search

Checks

```
16

↓

38

↓

72
```

Only **3 comparisons**.

As the array grows larger, Binary Search becomes significantly faster.

---

# 3. Prerequisites

Binary Search works only if:

- The array is **sorted**.
- Random access is possible (arrays provide O(1) indexing).

If the array is unsorted, Binary Search **cannot** be used.

---

# 4. Linear Search vs Binary Search

| Feature | Linear Search | Binary Search |
|----------|---------------|---------------|
| Array Required | Sorted / Unsorted | Sorted Only |
| Time Complexity | O(n) | O(log n) |
| Best Case | O(1) | O(1) |
| Worst Case | O(n) | O(log n) |

---

# 5. Intuition

Imagine searching for a word in a dictionary.

You don't start from the first page.

Instead,

- Open the middle page.
- Decide whether the word lies before or after it.
- Ignore half of the dictionary.
- Repeat.

Binary Search follows the same idea.

---

# 6. How Binary Search Works

Maintain two pointers.

```text
Start

↓

2 5 8 12 16 23 38 56 72 91

↑

End
```

Find the middle.

```
mid = (start + end) / 2
```

If

```
arr[mid] == key
```

Return the index.

If

```
key < arr[mid]
```

Search the left half.

Else

Search the right half.

Repeat until

```
start > end
```

---

# 7. Algorithm

1. Initialize

```java
start = 0

end = arr.length - 1
```

2. Find the middle index.

3. Compare the middle element with the target.

4. If equal, return the index.

5. If target is smaller, search the left half.

6. Otherwise search the right half.

7. Repeat until the element is found or the search space becomes empty.

---

# 8. Dry Run

Array

```text
2 5 8 12 16 23 38 56 72 91
```

Target

```
38
```

| Start | End | Mid | Value | Action |
|------:|----:|----:|------:|--------|
|0|9|4|16|Search Right|
|5|9|7|56|Search Left|
|5|6|5|23|Search Right|
|6|6|6|38|Found|

Output

```
Index = 6
```

---

# 9. Java Implementation

```java
public static int binarySearch(int[] arr, int key){

    int start = 0;
    int end = arr.length - 1;

    while(start <= end){

        int mid = start + (end - start) / 2;

        if(arr[mid] == key){
            return mid;
        }

        if(key < arr[mid]){
            end = mid - 1;
        }else{
            start = mid + 1;
        }

    }

    return -1;
}
```

### Why use

```java
start + (end - start) / 2
```

instead of

```java
(start + end) / 2
```

Because

```java
start + end
```

may overflow for very large arrays.

Although rare in Java interview-sized problems, using the safer formula is considered good practice.

---

# 10. Time & Space Complexity

| Case | Complexity |
|------|------------|
| Best | O(1) |
| Average | O(log n) |
| Worst | O(log n) |

Space

```
O(1)
```

---

# 11. Common Mistakes

### ❌ Using Binary Search on an Unsorted Array

Binary Search only works on sorted arrays.

---

### ❌ Incorrect loop condition

Wrong

```java
while(start < end)
```

Correct

```java
while(start <= end)
```

Otherwise, a single remaining element may never be checked.

---

### ❌ Incorrect Mid Calculation

Avoid

```java
int mid = (start + end) / 2;
```

Prefer

```java
int mid = start + (end - start) / 2;
```

---

### ❌ Forgetting to update pointers

Always move

```java
start = mid + 1;
```

or

```java
end = mid - 1;
```

Otherwise, the loop may never terminate.

---

# 12. Pattern Recognition

Think Binary Search when you see:

- Sorted array
- Sorted list
- Find an element
- First occurrence
- Last occurrence
- Search Insert Position
- Rotated Sorted Array

Keywords like **sorted**, **ordered**, or **monotonic** are strong hints that Binary Search might apply.

---

# 13. Interview Perspective

### Q1. Why is Binary Search O(log n)?

Because the search space is halved after every comparison.

---

### Q2. Can Binary Search work on a Linked List?

No.

Binary Search requires efficient random access, which linked lists do not provide.

---

### Q3. What happens if duplicate elements exist?

A normal Binary Search may return **any** occurrence.

To find the **first** or **last** occurrence, modify the search logic.

---

### Q4. Why use the overflow-safe mid calculation?

It prevents integer overflow when `start + end` exceeds the maximum value of an `int`.

---

# 14. Quick Revision

- Array must be sorted.
- Divide the search space into halves.
- Compare with the middle element.
- Best → O(1)
- Worst → O(log n)
- Space → O(1)
- Use `start + (end - start) / 2`.

---

# 15. Practice Problems

### Easy

- Binary Search
- Search Insert Position
- Guess Number Higher or Lower

### Medium

- First and Last Position of Element
- Search in Rotated Sorted Array
- Find Peak Element

### Hard

- Median of Two Sorted Arrays
- Split Array Largest Sum

---

## 🧠 How to Derive Binary Search

Brute Force

↓

Check every element one by one.

↓

Observation

The array is sorted.

↓

Idea

Compare with the middle element.

↓

Discard half of the search space.

↓

Repeat.

↓

Result

Time Complexity = **O(log n)**

---

## 💡 Key Insight

Binary Search is not about finding the middle element.

It is about **eliminating half of the search space after every comparison**.

That's why it is dramatically faster than Linear Search for large sorted datasets.
