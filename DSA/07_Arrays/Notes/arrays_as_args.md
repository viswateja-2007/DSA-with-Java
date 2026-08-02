# 📘 Arrays as Function Arguments

> **Difficulty:** ⭐ Beginner
> **Category:** Arrays
> **Language:** Java

---

# 📑 Table of Contents

1. Why Pass Arrays to Methods?
2. How Java Passes Arrays
3. Passing Arrays to Methods
4. Modifying Arrays Inside Methods
5. Why Changes Reflect Outside the Method
6. Memory Representation
7. Common Mistakes
8. Time & Space Complexity
9. Interview Perspective
10. Quick Revision
11. Practice Problems

---

# 1. Why Pass Arrays to Methods?

Suppose you want to print an array from different places in your program.

Instead of writing the same loop multiple times,

```java
for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
}
```

you can write a method once and reuse it.

```java
printArray(arr);
```

This improves

- Readability
- Reusability
- Maintainability

---

# 2. How Java Passes Arrays

Many beginners think Java passes arrays by value.

This is **not completely true.**

Java always passes **arguments by value**, but for objects (including arrays), the value being passed is the **reference**.

That means:

- The reference is copied.
- Both references point to the **same array**.

---

# 3. Passing Arrays to Methods

## Syntax

```java
public static void printArray(int[] arr){

}
```

Calling

```java
printArray(numbers);
```

Example

```java
public static void printArray(int[] arr){

    for(int num : arr){
        System.out.print(num + " ");
    }

}
```

---

# 4. Modifying Arrays Inside Methods

```java
public static void update(int[] arr){

    arr[0] = 100;

}
```

Calling

```java
update(arr);
```

Original array

```
10 20 30
```

After method call

```
100 20 30
```

The original array changes.

---

# 5. Why Does This Happen?

Arrays are objects.

The method receives another reference pointing to the same object.

```text
main()

arr
 │
 │
 ▼

+-----+-----+-----+
| 10  | 20  | 30  |
+-----+-----+-----+

           ▲
           │
           │

update()

arr
```

Both variables point to the same memory.

Changing the array through one reference changes the same array.

---

# 6. Memory Representation

Before calling

```java
update(arr);
```

```text
Stack

main()

arr
 │
 ▼

Heap

+-----+-----+-----+
| 10  | 20  | 30  |
+-----+-----+-----+
```

After calling

```text
Stack

main()

arr
 │
 │
 ▼

Heap

+-----+-----+-----+
|100  | 20  | 30  |
+-----+-----+-----+

           ▲
           │

update()

arr
```

Notice

No new array is created.

Only another reference is created.

---

# 7. Common Mistakes

### ❌ Thinking arrays are copied

Wrong

```
Method gets a new array.
```

Correct

```
Method gets another reference.
```

---

### ❌ Reassigning the parameter

```java
arr = new int[5];
```

Now the parameter points to a different array.

The original array remains unchanged.

---

# 8. Time & Space Complexity

Passing an array to a method

Time

```
O(1)
```

Only a reference is copied.

Space

```
O(1)
```

No new array is created.

---

# 9. Interview Perspective

### Q1

Why does modifying an array inside a method affect the original array?

Answer

Because both references point to the same array object.

---

### Q2

Does Java pass arrays by reference?

Answer

No.

Java always passes by value.

For arrays, the value being passed is the reference.

---

### Q3

Can we prevent the original array from changing?

Yes.

Create a copy.

```java
int[] copy = arr.clone();
```

or

```java
Arrays.copyOf()
```

---

# 10. Quick Revision

✓ Arrays are objects.

✓ Java passes a copy of the reference.

✓ Both references point to the same object.

✓ Changes are reflected outside the method.

✓ Passing an array is O(1).

---

# 11. Practice Problems

- Reverse an Array
- Rotate Array
- Move Zeroes
- Merge Sorted Arrays
