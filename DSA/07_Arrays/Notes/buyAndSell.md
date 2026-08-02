# 📘 Best Time to Buy and Sell Stock

> **Difficulty:** ⭐⭐ Easy
> **Category:** Arrays
> **Language:** Java

---

# 📑 Table of Contents

- [Problem Statement](#1-problem-statement)
- [Understanding the Problem](#2-understanding-the-problem)
- [Brute Force Approach](#3-brute-force-approach)
- [Thinking Process](#4-thinking-process)
- [Optimal Approach](#5-optimal-approach)
- [Algorithm](#6-algorithm)
- [Dry Run](#7-dry-run)
- [Java Implementation](#8-java-implementation)
- [Time & Space Complexity](#9-time--space-complexity)
- [Common Mistakes](#10-common-mistakes)
- [Pattern Recognition](#11-pattern-recognition)
- [Interview Perspective](#12-interview-perspective)
- [Quick Revision](#13-quick-revision)
- [Practice Problems](#14-practice-problems)

---

# 1. Problem Statement

You are given an array where each element represents the stock price on a particular day.

Your task is to maximize the profit by choosing:

- One day to buy.
- One future day to sell.

You may complete **only one transaction**.

If no profit is possible, return **0**.

---

## Example 1

```text
Prices

7 1 5 3 6 4
```

Buy

```
1
```

Sell

```
6
```

Profit

```
5
```

---

## Example 2

```text
Prices

7 6 4 3 1
```

No profitable transaction exists.

Output

```
0
```

---

# 2. Understanding the Problem

There are two important rules.

### Rule 1

You must **buy before selling**.

This is valid.

```text
Buy → Sell

1      6
```

This is **not**.

```text
Sell → Buy

6      1
```

---

### Rule 2

Only one transaction is allowed.

```
Buy

↓

Sell
```

That's it.

---

# 3. Brute Force Approach

Check every possible buying day.

For each buying day,

check every possible selling day.

Choose the maximum profit.

Pseudo Code

```java
for every buy

    for every sell

        profit = sell - buy
```

Time Complexity

```
O(n²)
```

Can we do better?

Yes.

---

# 4. Thinking Process

Instead of checking every previous buying day,

ask yourself:

> "What is the cheapest stock price I have seen so far?"

As we move through the array,

we only need to remember one thing.

```
Minimum Price Seen So Far
```

Whenever a new price appears,

calculate

```
Current Profit = Current Price - Minimum Price
```

If this profit is larger than our previous answer,

update it.

This observation reduces the solution to **one traversal**.

---

# 5. Optimal Approach

Maintain two variables.

```
buy

profit
```

Initially

```java
buy = Integer.MAX_VALUE;
profit = 0;
```

For every price

```
buy

=

minimum price so far
```

Then

```
profit

=

current price

-

buy
```

Update

```
maximum profit
```

Continue until the end.

---

# 6. Algorithm

1. Assume the minimum buying price is infinity.
2. Traverse the array.
3. Update the minimum buying price.
4. Calculate today's profit.
5. Update maximum profit.
6. Return the answer.

---

# 7. Dry Run

Input

```text
7 1 5 3 6 4
```

|Day|Price|Buy|Today's Profit|Max Profit|
|--:|----:|--:|-------------:|---------:|
|1|7|7|0|0|
|2|1|1|0|0|
|3|5|1|4|4|
|4|3|1|2|4|
|5|6|1|5|5|
|6|4|1|3|5|

Answer

```
5
```

---

## Dry Run (No Profit)

```text
7 6 4 3 1
```

|Price|Buy|Profit|Max Profit|
|----:|--:|------:|---------:|
|7|7|0|0|
|6|6|0|0|
|4|4|0|0|
|3|3|0|0|
|1|1|0|0|

Answer

```
0
```

---

# 8. Java Implementation

```java
public static int buyAndSell(int arr[]){

    int buy = Integer.MAX_VALUE;
    int profitMax = 0;
    int profit = 0;

    for(int i = 0; i < arr.length; i++){

      int sell = arr[i];
      buy = Math.min(buy, sell);
      if(buy < sell){
        profit = sell - buy;
      }

      profitMax = Math.max(profit, profitMax);

    }

    return profitMax;

  }
```

---

## Why Does This Work?

At every index,

```
buy
```

stores the **smallest price seen so far**.

Therefore,

```
current price - buy
```

is the **best possible profit if we sell today**.

Taking the maximum over all days guarantees the optimal answer.

---

# 9. Time & Space Complexity

| Operation | Complexity |
|-----------|-----------:|
| Time | O(n) |
| Space | O(1) |

Only one traversal is required.

---

# 10. Common Mistakes

### ❌ Initializing maxProfit to Integer.MIN_VALUE

Wrong

```java
int maxProfit = Integer.MIN_VALUE;
```

Correct

```java
int maxProfit = 0;
```

If prices keep decreasing,

the answer should be **0**, not a negative value.

---

### ❌ Updating Profit Before Buy

Wrong

```java
profit = price - buy;

buy = Math.min(buy, price);
```

Always update the buying price first.

---

### ❌ Forgetting the Buy-Before-Sell Rule

Never compare today's price with a future minimum.

The minimum price must always come from the **past or current day**.

---

# 11. Pattern Recognition

When a problem says

- Maximum Profit
- Best Time to Buy
- Buy Once
- Sell Once
- Minimum So Far

Think

> Maintain the **minimum value seen so far** while traversing the array.

---

# 12. Interview Perspective

### Q1

Why can't we simply subtract the smallest element from the largest element?

Because the smallest price might occur **after** the largest price.

Buying must happen before selling.

---

### Q2

Why is this algorithm O(n)?

Each element is processed exactly once.

---

### Q3

How would the solution change if multiple transactions were allowed?

That becomes a different problem (LeetCode 122).

---

### Q4

Can we solve this using Dynamic Programming?

Yes.

But the greedy solution is simpler and optimal for one transaction.

---

# 13. Quick Revision

- Buy before Sell.
- Maintain the minimum price seen so far.
- Calculate today's profit.
- Update the maximum profit.
- Time → O(n)
- Space → O(1)

---

# 14. Practice Problems

### Easy

- Best Time to Buy and Sell Stock (LC 121)

### Medium

- Best Time to Buy and Sell Stock II
- Maximum Difference Between Increasing Elements

### Hard

- Best Time to Buy and Sell Stock III
- Best Time to Buy and Sell Stock IV
- Best Time to Buy and Sell Stock with Cooldown

---

## 💡 Key Insight

Don't try every buying day.

Instead, while scanning the array from left to right, continuously ask:

> **"What's the cheapest price I've seen so far?"**

That single question transforms an **O(n²)** solution into an **O(n)** solution.

