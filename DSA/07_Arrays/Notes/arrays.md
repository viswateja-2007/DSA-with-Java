# 📘 Array Basics

> **Difficulty:** ⭐ Beginner
> **Category:** Arrays
> **Language:** Java

---

# 📑 Table of Contents

1. What is an Array?
2. Why do we need Arrays?
3. Declaration & Initialization
4. Memory Representation
5. Accessing Elements
6. Traversing Arrays
7. Taking Input & Output
8. Default Values
9. Array Length
10. Passing Arrays to Methods
11. Common Mistakes
12. Time & Space Complexity
13. Interview Perspective
14. Quick Revision
15. Practice Problems

---

# 1. What is an Array?

An **array** is a collection of elements of the **same data type** stored in **contiguous memory locations**.

Each element is identified by an **index**, starting from **0**.

```java
int[] marks = {90, 85, 95};
```

```text
Index

 0      1      2
+------+------+------+
| 90   | 85   | 95   |
+------+------+------+
```

---

## Characteristics

- Stores homogeneous data (same data type).
- Fixed size once created.
- Supports direct access using an index.
- Stored in contiguous memory.

---

# 2. Why do we need Arrays?

Suppose you need to store marks of five students.

Without arrays

```java
int m1 = 90;
int m2 = 85;
int m3 = 95;
int m4 = 88;
int m5 = 92;
```

With arrays

```java
int[] marks = {90, 85, 95, 88, 92};
```

Now every element can be processed using loops.

```java
for(int i = 0; i < marks.length; i++){
    System.out.println(marks[i]);
}
```

### Advantages

- Less code
- Easy traversal
- Easy searching
- Easy sorting

---

# 3. Declaration & Initialization

## Declaration

```java
int[] arr;
```

or

```java
int arr[];
```

> **Best Practice:** Prefer `int[] arr` because it follows Java coding conventions.

---

## Creation

```java
int[] arr = new int[5];
```

Creates an integer array of size **5**.

---

## Initialization

```java
int[] arr = {10, 20, 30, 40};
```

Java automatically determines the size.

---

# 4. Memory Representation

Arrays are stored in **contiguous memory**.

```text
Stack

arr
 │
 ▼

Heap

+------+------+------+------+
| 10   | 20   | 30   | 40   |
+------+------+------+------+
```

Because elements are stored one after another, Java can calculate the address of any element directly.

This is why array access is **O(1)**.

---

# 5. Accessing Elements

Syntax

```java
arr[index]
```

Example

```java
System.out.println(arr[2]);
```

Output

```
30
```

---

# 6. Traversing Arrays

```java
for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
}
```

Output

```
10 20 30 40
```

---

# 7. Taking Input & Output

```java
Scanner sc = new Scanner(System.in);

for(int i = 0; i < arr.length; i++){
    arr[i] = sc.nextInt();
}
```

Printing

```java
for(int num : arr){
    System.out.print(num + " ");
}
```

---

# 8. Default Values

| Data Type | Default Value |
|-----------|---------------|
| int | 0 |
| double | 0.0 |
| boolean | false |
| char | '\u0000' |
| String | null |

---

# 9. Array Length

```java
arr.length
```

Example

```java
System.out.println(arr.length);
```

Output

```
5
```

---

# 10. Passing Arrays to Methods

```java
public static void print(int[] arr){
    for(int num : arr){
        System.out.print(num + " ");
    }
}
```

Since arrays are objects in Java, the method receives a reference to the same array.

---

# 11. Common Mistakes

### ❌ Accessing an invalid index

```java
arr[5]
```

If the array size is 5, the last valid index is **4**.

Throws

```
ArrayIndexOutOfBoundsException
```

---

### ❌ Using `length()`

Wrong

```java
arr.length()
```

Correct

```java
arr.length
```

---

### ❌ Forgetting array indices start from 0

First element

```java
arr[0]
```

not

```java
arr[1]
```

---

# 12. Time & Space Complexity

| Operation | Complexity |
|-----------|------------|
| Access | O(1) |
| Update | O(1) |
| Search | O(n) |
| Insertion | O(n) |
| Deletion | O(n) |

Space Complexity

```
O(n)
```

---

# 13. Interview Perspective

### Frequently Asked Questions

**Q1. Why is array access O(1)?**

Because elements are stored in contiguous memory, allowing direct address calculation.

---

**Q2. Why is insertion O(n)?**

Elements must be shifted to make space.

---

**Q3. Why are arrays fixed in size?**

Memory for the entire array is allocated when it is created.

---

# 14. Quick Revision

- Arrays store homogeneous data.
- Indexing starts from 0.
- Arrays have fixed size.
- Stored in contiguous memory.
- Access → O(1)
- Search → O(n)
- Insertion → O(n)
- Deletion → O(n)

---

# 15. Practice Problems

### Easy

- Largest Element
- Linear Search
- Reverse Array

### Medium

- Buy and Sell Stocks
- Trapping Rain Water

### Hard

- First Missing Positive
- Median of Two Sorted Arrays
