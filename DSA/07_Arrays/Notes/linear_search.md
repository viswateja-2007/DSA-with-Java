# 📘 Linear Search

> **Difficulty:** ⭐ Easy
> **Category:** Arrays
> **Language:** Java

---
# 📑 Table of Contents

- [What is Linear Search?](#1-what-is-linear-search)
- [Why do we need Linear Search?](#2-why-do-we-need-linear-search)
- [How Linear Search Works](#3-how-linear-search-works)
- [Algorithm](#4-algorithm)
- [Dry Run](#5-dry-run)
- [Java Implementation](#6-java-implementation)
- [Time & Space Complexity](#7-time--space-complexity)
- [Advantages & Limitations](#8-advantages--limitations)
- [Common Mistakes](#9-common-mistakes)
- [Interview Perspective](#10-interview-perspective)
- [Quick Revision](#11-quick-revision)
- [Practice Problems](#12-practice-problems)

---

# 1. What is Linear Search?

Linear Search is the simplest searching algorithm.

It searches for an element by **checking every element one by one** from the beginning until the target element is found or the array ends.

Unlike Binary Search, the array **does not need to be sorted**.

---

# 2. Why do we need Linear Search?

Suppose you have the following array.

```text
[15, 8, 21, 6, 17]
```

Find

```
6
```

Since the array is **unsorted**, Binary Search cannot be used.

The only option is to check every element sequentially.

```
15 ❌

8 ❌

21 ❌

6 ✅
```

Element found.

---

# 3. How Linear Search Works

The algorithm starts from index **0**.

It compares every element with the target.

If

```
current element == target
```

return its index.

Otherwise continue.

If the entire array is traversed,

return

```
-1
```

indicating that the element does not exist.

---

# 4. Algorithm

1. Start from index `0`.
2. Compare the current element with the target.
3. If both are equal, return the index.
4. Otherwise move to the next element.
5. If the array ends, return `-1`.

---

# 5. Dry Run

Array

```text
15  8  21  6  17
```

Target

```
6
```

| Iteration | Index | Element | Match |
|-----------|------:|--------:|------|
|1|0|15|❌|
|2|1|8|❌|
|3|2|21|❌|
|4|3|6|✅|

Output

```
3
```

---

### Element Not Found

Target

```
10
```

| Iteration | Element |
|-----------|---------|
|15|❌|
|8|❌|
|21|❌|
|6|❌|
|17|❌|

Output

```
-1
```

---

# 6. Java Implementation

```java
public static int linearSearch(int[] arr, int key){

    for(int i = 0; i < arr.length; i++){

        if(arr[i] == key){
            return i;
        }

    }

    return -1;

}
```

### Explanation

```java
for(int i = 0; i < arr.length; i++)
```

Traverses the entire array.

---

```java
if(arr[i] == key)
```

Checks whether the current element matches the target.

---

```java
return i;
```

Returns the index immediately after finding the element.

No unnecessary comparisons are performed.

---

```java
return -1;
```

Indicates that the element does not exist.

---

# 7. Time & Space Complexity

| Case | Complexity |
|------|------------|
|Best|O(1)|
|Average|O(n)|
|Worst|O(n)|

Space

```
O(1)
```

---

### Why?

Best case

The first element itself is the target.

Worst case

The target is the last element or absent.

---

# 8. Advantages & Limitations

## Advantages

- Works on unsorted arrays.
- Easy to implement.
- No preprocessing required.

---

## Limitations

- Slow for large datasets.
- Checks elements one by one.
- Less efficient than Binary Search on sorted data.

---

# 9. Common Mistakes

### ❌ Returning `0`

Wrong

```java
return 0;
```

Use

```java
return -1;
```

because index `0` may be a valid answer.

---

### ❌ Forgetting `return`

```java
if(arr[i] == key){
    i;
}
```

Always return the index.

---

### ❌ Using

```java
i <= arr.length
```

Correct

```java
i < arr.length
```

Otherwise

```
ArrayIndexOutOfBoundsException
```

---

# 10. Interview Perspective

### Q1

Can Linear Search work on unsorted arrays?

✅ Yes.

---

### Q2

Can Binary Search replace Linear Search?

❌ No.

Binary Search requires a sorted array.

---

### Q3

When should Linear Search be preferred?

- Small arrays
- Unsorted arrays
- One-time searches

---

### Follow-up

How would you search efficiently if multiple searches are performed?

Expected answer

- Sort the array first.
- Use Binary Search.

or

- Store elements in a HashSet.

---

# 11. Quick Revision

- Sequential search.
- Works on unsorted arrays.
- Returns index.
- Returns -1 if absent.
- Best → O(1)
- Worst → O(n)
- Space → O(1)

---

# 12. Practice Problems

### Easy

- Find Largest Element
- Find Smallest Element
- Count Occurrences

### Medium

- Search Insert Position
- First and Last Position of Element

### Hard

- Search in Rotated Sorted Array

