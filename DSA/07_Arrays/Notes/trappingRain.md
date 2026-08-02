# 📘 Trapping Rain Water

> **Difficulty:** ⭐⭐⭐ Medium
> **Category:** Arrays
> **Language:** Java

---
# 📑 Table of Contents

- [Problem Statement](#1-problem-statement)
- [Understanding the Problem](#2-understanding-the-problem)
- [Why Does Water Get Trapped?](#3-why-does-water-get-trapped)
- [Key Observation](#4-key-observation)
- [Brute Force Approach](#5-brute-force-approach)
- [Optimized Approach (LeftMax & RightMax)](#6-optimized-approach-leftmax--rightmax)
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

Given an array where each element represents the height of a building, determine how much rainwater can be trapped after raining.

Example

```text
Height

[4,2,0,6,3,2,5]
```

Output

```text
11
```

---

# 2. Understanding the Problem

Imagine pouring water over the buildings.

Water collects only in valleys.

```text
        █
█~~~~~~█
█~█~~███
████████

```

The blue region (water) is trapped because taller buildings exist on both sides.

---

# 3. Why Does Water Get Trapped?

For water to stay at an index,

there must be

- A taller building on the left.
- A taller building on the right.

Without both,

the water simply flows away.

Example

```text
3 0 2
```

Water remains.

Example

```text
3 0
```

Water escapes.

---

# 4. Key Observation

The amount of water above a building depends only on

```
Minimum

(

Highest wall on Left,

Highest wall on Right

)

−

Current Height
```

Formula

```text
Water[i]

=

min(leftMax[i], rightMax[i])

-

height[i]
```

This is the heart of the entire algorithm.

---

# 5. Brute Force Approach

For every building,

find

- Highest wall on the left.
- Highest wall on the right.

Calculate trapped water.

Time

```
O(n²)
```

because every index searches both sides.

---

# 6. Optimized Approach

Instead of searching repeatedly,

precompute

```
LeftMax
```

and

```
RightMax
```

arrays.

Now each index is solved in

```
O(1)
```

---

## LeftMax

```text
Height

4 2 0 6 3 2 5

LeftMax

4 4 4 6 6 6 6
```

---

## RightMax

```text
Height

4 2 0 6 3 2 5

RightMax

6 6 6 6 5 5 5
```

---

# 7. Algorithm

Step 1

Create

```
LeftMax
```

Step 2

Create

```
RightMax
```

Step 3

For every building

```
Water Level

=

min(LeftMax, RightMax)
```

Step 4

```
Water

=

Water Level

-

Current Height
```

Step 5

Add all trapped water.

---

# 8. Dry Run

Input

```text
Height

4 2 0 6 3 2 5
```

|Index|Height|LeftMax|RightMax|Water|
|----:|-----:|------:|--------:|----:|
|0|4|4|6|0|
|1|2|4|6|2|
|2|0|4|6|4|
|3|6|6|6|0|
|4|3|6|5|2|
|5|2|6|5|3|
|6|5|6|5|0|

Total

```
11
```

---

# 9. Java Implementation

### Step 1

Compute LeftMax

```java
leftMax[0] = height[0];

for(int i = 1; i < n; i++){
    leftMax[i] = Math.max(height[i], leftMax[i-1]);
}
```

---

### Step 2

Compute RightMax

```java
rightMax[n-1] = height[n-1];

for(int i = n-2; i >= 0; i--){
    rightMax[i] = Math.max(height[i], rightMax[i+1]);
}
```

---

### Step 3

Calculate Water

```java
int water = 0;

for(int i = 0; i < n; i++){

    int level = Math.min(leftMax[i], rightMax[i]);

    water += level - height[i];

}
```

---

# 10. Time & Space Complexity

| Operation | Complexity |
|-----------|-----------:|
| LeftMax | O(n) |
| RightMax | O(n) |
| Water Calculation | O(n) |

Overall

```
Time : O(n)

Space : O(n)
```

---

# 11. Common Mistakes

### ❌ Using Maximum instead of Minimum

Wrong

```java
Math.max(left,right)
```

Correct

```java
Math.min(left,right)
```

The smaller wall limits the water level.

---

### ❌ Forgetting Boundary Buildings

First and last buildings cannot trap water.

---

### ❌ Wrong RightMax Traversal

Traverse

```java
n-2
```

to

```java
0
```

not left to right.

---

# 12. Pattern Recognition

Whenever the problem says

- Water
- Height
- Elevation Map
- Highest Left
- Highest Right

Think

```
LeftMax

+

RightMax
```

---

# 13. Interview Perspective

### Q1

Why do we use

```
Minimum
```

instead of Maximum?

Because water spills over the shorter wall.

---

### Q2

Can this problem be solved without extra arrays?

Yes.

Using

```
Two Pointers
```

Space becomes

```
O(1)
```

---

### Q3

Which solution is preferred?

For beginners

```
LeftMax + RightMax
```

For interviews

```
Two Pointer
```

---

# 14. Quick Revision

✓ Water depends on LeftMax and RightMax.

✓ Formula

```
min(left,right)-height
```

✓ Build two helper arrays.

✓ Time → O(n)

✓ Space → O(n)

✓ Two Pointer optimization → O(1) Space.

---

# 15. Practice Problems

### Easy

- Container With Most Water (Compare the difference)

### Medium

- Trapping Rain Water
- Buildings With Ocean View

### Hard

- Trapping Rain Water II

---

# 16. What's Next?

So far we've learned:

- Arrays
- Linear Search
- Prefix Sum
- Kadane's Algorithm
- Trapping Rain Water

The final array problem in this section is **Best Time to Buy and Sell Stock**, where we'll learn how to maintain the minimum value seen so far to maximize profit in a single traversal.
