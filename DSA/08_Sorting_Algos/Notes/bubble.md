# 📘 Bubble Sort

> **Difficulty:** ⭐ Easy  
> **Category:** Sorting  
> **Language:** Java

---

# 📑 Table of Contents

- [What is Bubble Sort?](#1-what-is-bubble-sort)
- [Why Do We Need Sorting?](#2-why-do-we-need-sorting)
- [Intuition](#3-intuition)
- [Algorithm](#4-algorithm)
- [Dry Run](#5-dry-run)
- [Java Implementation](#6-java-implementation)
- [Code Walkthrough](#7-code-walkthrough)
- [Why `n - 1 - i` is an Optimization](#8-why-n---1---i-is-an-optimization)
- [Complexity Analysis](#9-complexity-analysis)
- [Common Mistakes](#10-common-mistakes)
- [Interview Perspective](#11-interview-perspective)
- [Quick Revision](#12-quick-revision)
- [Practice Problems](#13-practice-problems)

---

# 1. What is Bubble Sort?

Bubble Sort is one of the simplest sorting algorithms.

It repeatedly compares **adjacent elements** and swaps them if they are in the wrong order.

After every pass, the **largest unsorted element moves to its correct position** at the end of the array.

---

# 2. Why Do We Need Sorting?

Many algorithms become more efficient after sorting.

Example:

Before Sorting

```text
5 4 1 3 2
```

After Sorting

```text
1 2 3 4 5
```

Sorting is commonly used before:

- Binary Search
- Duplicate Detection
- Merging Arrays
- Data Analysis

---

# 3. Intuition

Imagine arranging books on a shelf from shortest to tallest.

You compare two neighbouring books.

If the left one is taller, swap them.

Continue this until the end.

After one complete pass, the tallest book automatically reaches the last position.

Repeat the same process for the remaining unsorted books.

This is exactly how Bubble Sort works.

---

# 4. Algorithm

1. Traverse the array `n - 1` times.
2. Compare adjacent elements.
3. Swap them if they are in the wrong order.
4. Ignore the last sorted element in the next pass.
5. Continue until the array is sorted.

---

# 5. Dry Run

Input

```text
5 4 1 3 2
```

## Pass 1

```text
5 4 1 3 2
│ │
Swap

4 5 1 3 2

4 5 1 3 2
  │ │
  Swap

4 1 5 3 2

4 1 5 3 2
    │ │
    Swap

4 1 3 5 2

4 1 3 5 2
      │ │
      Swap

4 1 3 2 5
```

Largest element fixed:

```text
4 1 3 2 | 5
```

---

## Pass 2

```text
4 1 3 2 5

↓

1 4 3 2 5

↓

1 3 4 2 5

↓

1 3 2 4 5
```

Largest two elements fixed

```text
1 3 2 | 4 5
```

---

## Pass 3

```text
1 3 2 4 5

↓

1 2 3 4 5
```

Sorted Array

---

# 6. Java Implementation

```java
public class Bubble {

    public static int[] bubbleSort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }

        return arr;
    }
}
```

---

# 7. Code Walkthrough

## Outer Loop

```java
for(int i = 0; i < n - 1; i++)
```

Runs the algorithm for **n - 1 passes**.

Each pass places one element in its final sorted position.

---

## Inner Loop

```java
for(int j = 0; j < n - 1 - i; j++)
```

Traverses only the **unsorted portion** of the array.

The sorted elements at the end are ignored.

---

## Swap Condition

```java
if(arr[j] > arr[j + 1])
```

If the left element is greater,

swap them.

```java
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
```

---

# 8. Why `n - 1 - i` is an Optimization

Suppose

```text
5 4 1 3 2
```

After Pass 1

```text
4 1 3 2 | 5
```

Notice that **5 is already in its correct position**.

There is no need to compare it again.

After Pass 2

```text
1 3 2 | 4 5
```

Now **4 and 5** are fixed.

Again, no need to compare them.

Therefore,

the comparison range decreases after every pass.

| Pass | Comparisons |
|------|------------:|
|1|4|
|2|3|
|3|2|
|4|1|

This reduces unnecessary comparisons.

---

# 9. Complexity Analysis

| Case | Time Complexity |
|------|-----------------|
| Best* | O(n) |
| Average | O(n²) |
| Worst | O(n²) |

\*Best case is achieved only when using a **swapped flag**.

Space Complexity

```text
O(1)
```

Bubble Sort is an **in-place sorting algorithm**.

---

# 10. Common Mistakes

## ❌ Wrong Inner Loop

Wrong

```java
for(int j = 0; j < n; j++)
```

This causes

```
ArrayIndexOutOfBoundsException
```

Correct

```java
for(int j = 0; j < n - 1 - i; j++)
```

---

## ❌ Printing Array Directly

Wrong

```java
System.out.println(arr);
```

Output

```
[I@7cca494b
```

Correct

```java
for(int num : arr){
    System.out.print(num + " ");
}
```

---

## ❌ Incorrect Swap

Wrong

```java
temp = arr[j + 1];
```

Correct

```java
temp = arr[j];
```

---

## ❌ Forgetting `-i`

The algorithm still sorts correctly.

However,

it performs unnecessary comparisons with already sorted elements.

---

# 11. Interview Perspective

### Q1. Why is Bubble Sort called Bubble Sort?

Because after every pass, the largest unsorted element "bubbles" to the end.

---

### Q2. Is Bubble Sort Stable?

Yes.

Equal elements never change their relative order.

---

### Q3. Is Bubble Sort In-place?

Yes.

Only one temporary variable is used.

---

### Q4. Can Bubble Sort be Optimized?

Yes.

Using a **swapped flag**.

If no swaps occur during a pass,

the array is already sorted.

Best Case

```
O(n)
```

---

### Q5. Why isn't Bubble Sort used in real-world applications?

Because its average and worst-case complexity is **O(n²)**.

Algorithms like Merge Sort and Quick Sort are much faster for large datasets.

---

# 12. Quick Revision

- Compare adjacent elements.
- Swap if left > right.
- Largest element reaches the end after every pass.
- Use `n - 1 - i` to skip the sorted suffix.
- Stable sorting algorithm.
- In-place sorting algorithm.
- Best → O(n) (optimized).
- Average/Worst → O(n²).

---

# 13. Practice Problems

### Easy

- Bubble Sort
- Sort Colors (understand why Bubble Sort isn't suitable)

### Medium

- Relative Sort Array
- Sort an Array

### Compare Next

- Selection Sort
- Insertion Sort

---

# 💡 Key Insight

The most important observation in Bubble Sort is:

> **After every pass, the largest unsorted element reaches its correct position.**

Because of this,

the inner loop can ignore the last sorted elements using:

```java
n - 1 - i
```

This optimization reduces unnecessary comparisons while keeping the algorithm correct.
