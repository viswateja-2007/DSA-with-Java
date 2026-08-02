# 📘 Contains Duplicate

> **Difficulty:** ⭐ Easy
> **Category:** Arrays, Hashing
> **Language:** Java

---

# 📑 Table of Contents

1. Problem Statement
2. Understanding the Problem
3. Brute Force Approach
4. Better Approach (Sorting)
5. Optimal Approach (HashSet)
6. Dry Run
7. Java Implementations
8. Time & Space Complexity
9. Common Mistakes
10. Pattern Recognition
11. Interview Perspective
12. Quick Revision
13. Practice Problems

---

# 1. Problem Statement

Given an integer array `nums`, determine whether any value appears **more than once**.

Return

- `true` → if a duplicate exists.
- `false` → otherwise.

---

## Example 1

```text
Input

[1,2,3,1]

Output

true
```

---

## Example 2

```text
Input

[1,2,3,4]

Output

false
```

---

## Example 3

```text
Input

[1,1,1,3,3,4]

Output

true
```

---

# 2. Understanding the Problem

The question is simple.

While scanning the array,

ask yourself

> **"Have I already seen this number?"**

If the answer is **yes**,

a duplicate exists.

---

# 3. Brute Force Approach

Compare every element with every other element.

```java
for(int i = 0; i < n; i++){

    for(int j = i + 1; j < n; j++){

        if(arr[i] == arr[j])
            return true;

    }

}
```

If no duplicate is found,

return

```java
false;
```

---

## Dry Run

```text
1 2 3 1
```

Comparisons

```
1 vs 2

1 vs 3

1 vs 1 ✅
```

Duplicate found.

Return

```
true
```

---

## Complexity

```
Time

O(n²)

Space

O(1)
```

---

# 4. Better Approach (Sorting)

Sort the array first.

```
1 2 3 1

↓

1 1 2 3
```

Now compare adjacent elements.

```
1 1

Duplicate
```

---

### Complexity

Sorting

```
O(n log n)
```

Traversal

```
O(n)
```

Overall

```
O(n log n)
```

---

# 5. Optimal Approach (HashSet)

A **HashSet** stores only **unique elements**.

Algorithm

For every element

```
Already present?

↓

Yes

↓

Duplicate
```

Otherwise

```
Insert into HashSet
```

---

### Java

```java
HashSet<Integer> set = new HashSet<>();

for(int num : nums){

    if(set.contains(num))
        return true;

    set.add(num);

}

return false;
```

---

# Why Does This Work?

A HashSet never stores duplicate values.

The first occurrence is inserted.

The second occurrence is immediately detected.

---

# 6. Dry Run

Array

```text
2 5 1 3 5
```

|Current|HashSet|Duplicate|
|------:|-------|---------|
|2|2|❌|
|5|2 5|❌|
|1|2 5 1|❌|
|3|2 5 1 3|❌|
|5|Already Exists|✅|

Return

```
true
```

---

# 7. Java Implementations

## Brute Force

```java
public boolean containsDuplicate(int[] nums){

    for(int i = 0; i < nums.length; i++){

        for(int j = i + 1; j < nums.length; j++){

            if(nums[i] == nums[j])
                return true;

        }

    }

    return false;

}
```

---

## Optimal

```java
HashSet<Integer> set = new HashSet<>();

for(int num : nums){

    if(set.contains(num))
        return true;

    set.add(num);

}

return false;
```

---

# 8. Time & Space Complexity

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| Sorting | O(n log n) | O(1)\* |
| HashSet | O(n) | O(n) |

> \* Depends on the sorting algorithm used.

---

# 9. Common Mistakes

### ❌ Comparing an element with itself

Wrong

```java
for(int j=i;j<n;j++)
```

Correct

```java
for(int j=i+1;j<n;j++)
```

---

### ❌ Returning false inside the loop

Wrong

```java
for(...){

    return false;

}
```

The loop stops after the first iteration.

Return `false` only after checking every element.

---

### ❌ Forgetting to import HashSet

```java
import java.util.HashSet;
```

---

# 10. Pattern Recognition

If the problem asks

- Duplicate
- Unique
- Frequency
- Already Seen
- Distinct Elements

Think

> **HashSet**

---

# 11. Interview Perspective

### Q1

Why is HashSet faster?

Because lookup is approximately

```
O(1)
```

---

### Q2

When should you avoid HashSet?

When memory usage is a concern.

---

### Q3

Can duplicates be detected without extra space?

Yes.

Sort the array first.

---

### Q4

Difference between HashSet and HashMap?

HashSet stores

```
Only keys
```

HashMap stores

```
Key → Value
```

---

# 12. Quick Revision

✓ Brute Force → O(n²)

✓ Sorting → O(n log n)

✓ HashSet → O(n)

✓ HashSet stores unique elements.

✓ Duplicate found if insertion fails (or contains returns true).

---

# 13. Practice Problems

### Easy

- Contains Duplicate II
- Missing Number

### Medium

- Top K Frequent Elements
- Group Anagrams

### Hard

- Longest Consecutive Sequence

---

## 🧠 How to Derive This Algorithm

Brute Force

↓

Compare every pair.

↓

Observation

We only need to know whether we've **seen the element before**.

↓

Data Structure

HashSet

↓

Result

Time: **O(n)**

Space: **O(n)**

---

## 💡 Key Insight

Don't compare every element with every other element.

Instead, remember the elements you've already seen.

If an element appears again, you've found a duplicate.
