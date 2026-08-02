# 📘 Prefix Sum

> **Difficulty:** ⭐⭐ Easy–Medium
> **Category:** Arrays
> **Language:** Java

---

# 📑 Table of Contents

1. What is Prefix Sum?
2. Why Do We Need Prefix Sum?
3. Brute Force Approach
4. Prefix Sum Concept
5. Constructing the Prefix Sum Array
6. Finding Range Sum
7. Dry Run
8. Java Implementation
9. Time & Space Complexity
10. Common Mistakes
11. Pattern Recognition
12. Interview Perspective
13. Quick Revision
14. Practice Problems
15. What's Next?

---

# 1. What is Prefix Sum?

A **Prefix Sum** array stores the cumulative sum of elements from the beginning of the array up to each index.

Instead of storing the original values,

```text
Original Array

2  4  6  8  10
```

we store

```text
Prefix Sum

2  6  12  20  30
```

Each element represents the sum of all previous elements including itself.

For example,

```text
prefix[2]

=

2 + 4 + 6

=

12
```

---

# 2. Why Do We Need Prefix Sum?

Suppose we are given

```text
2 4 6 8 10
```

Find the sum from

```
Index 1 to Index 3
```

The normal approach is

```text
4 + 6 + 8

=

18
```

Now imagine thousands of such queries.

```
Sum(1,3)

Sum(0,4)

Sum(2,4)

Sum(1,2)

...
```

Traversing every range repeatedly becomes expensive.

Prefix Sum solves this problem.

---

# 3. Brute Force Approach

To calculate every subarray sum,

we use

```text
Three loops
```

One for

- Start

One for

- End

One for

- Sum

Time Complexity

```
O(n³)
```

Even after removing the printing loop,

finding every subarray sum still requires

```
O(n²)
```

Can we calculate each range sum faster?

Yes.

---

# 4. Prefix Sum Concept

Instead of calculating the sum every time,

calculate it **once** and store it.

Example

```text
Original

2  4  6  8  10
```

Prefix

```text
2  6  12  20  30
```

Now,

instead of adding numbers repeatedly,

we subtract two prefix values.

---

# 5. Constructing the Prefix Sum Array

First element

```java
prefix[0] = arr[0];
```

Remaining elements

```java
prefix[i] = prefix[i-1] + arr[i];
```

### Dry Run

Original

```text
2 4 6 8 10
```

|Index|Calculation|Prefix|
|----:|-----------|-----:|
|0|2|2|
|1|2+4|6|
|2|6+6|12|
|3|12+8|20|
|4|20+10|30|

Final

```text
2 6 12 20 30
```

---

# 6. Finding Range Sum

Suppose

```text
Array

2 4 6 8 10
```

Prefix

```text
2 6 12 20 30
```

Find

```
Index 1 → 3
```

Formula

```java
prefix[end] - prefix[start-1]
```

Example

```
20 - 2

=

18
```

Correct answer.

---

### Special Case

If

```
start = 0
```

Then

```java
sum = prefix[end];
```

because

```
prefix[-1]
```

doesn't exist.

---

# 7. Dry Run

Array

```text
3 5 2 7 1
```

Prefix

```text
3 8 10 17 18
```

Find

```
Sum(2,4)
```

Formula

```
18 - 8

=

10
```

Verification

```
2 + 7 + 1

=

10
```

---

# 8. Java Implementation

```java
int[] prefix = new int[arr.length];

prefix[0] = arr[0];

for(int i = 1; i < arr.length; i++){

    prefix[i] = prefix[i-1] + arr[i];

}
```

Finding sum

```java
if(start == 0)
    sum = prefix[end];
else
    sum = prefix[end] - prefix[start-1];
```

---

# 9. Time & Space Complexity

Creating Prefix Array

|Operation|Complexity|
|---------|----------|
|Construction|O(n)|
|Single Query|O(1)|

Space

```
O(n)
```

---

# 10. Common Mistakes

### Forgetting the first element

Wrong

```java
for(int i=0;i<n;i++)
```

Correct

```java
prefix[0]=arr[0];
```

---

### Forgetting start = 0

```java
prefix[start-1]
```

becomes

```
prefix[-1]
```

which causes

```
ArrayIndexOutOfBoundsException
```

---

### Wrong Formula

Wrong

```java
prefix[end]-prefix[start]
```

Correct

```java
prefix[end]-prefix[start-1]
```

---

# 11. Pattern Recognition

If the problem asks

- Range Sum
- Multiple Sum Queries
- Sum between indices
- Cumulative Sum

Think

> **Prefix Sum**

---

# 12. Interview Perspective

### Q1

Why is Prefix Sum faster?

Because preprocessing is done once.

Every future query becomes O(1).

---

### Q2

When should Prefix Sum NOT be used?

When the array changes frequently.

Updating the prefix array repeatedly becomes expensive.

---

### Q3

Difference between Prefix Sum and Kadane's Algorithm?

Prefix Sum

```
Answers range sum queries.
```

Kadane

```
Finds maximum subarray sum.
```

---

# 13. Quick Revision

- Prefix stores cumulative sums.
- Construction → O(n).
- Range Query → O(1).
- Formula

```
prefix[end]-prefix[start-1]
```

- Handle

```
start = 0
```

separately.

---

# 14. Practice Problems

### Easy

- Range Sum Query
- Running Sum of 1D Array

### Medium

- Subarray Sum Equals K
- Pivot Index
- Continuous Subarray Sum

### Hard

- Count Range Sum

---

# 15. What's Next?

Prefix Sum reduces repeated summation from **O(n)** to **O(1)** per query.

However, it still requires **O(n²)** to find the **Maximum Subarray Sum** because every possible range must be checked.

In the next chapter, we'll learn **Kadane's Algorithm**, which solves the Maximum Subarray Sum problem in **O(n)** using a greedy approach.
