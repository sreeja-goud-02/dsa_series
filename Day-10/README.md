# 🚀 Day 11 - Missing Number (Optimal - Sum Formula)

## Problem Statement

Given an array containing **n-1** distinct numbers from **1 to n**, find the missing number.

---

## Example

### Input

```
arr = [1,2,4,5]
```

### Output

```
3
```

---

## Optimal Approach (Sum Formula)

The sum of the first **n** natural numbers is:

```
n × (n + 1) / 2
```

Calculate the expected sum using the formula and subtract the actual sum of the array.

The difference gives the missing number.

---

## Algorithm

1. Find `n = arr.length + 1`.
2. Calculate the expected sum using the formula.
3. Calculate the actual sum of the array.
4. Return `expectedSum - actualSum`.

---

## Dry Run

```
arr = [1,2,4,5]

n = 5

Expected Sum = 5 × 6 / 2 = 15

Actual Sum = 1 + 2 + 4 + 5 = 12

Missing Number = 15 - 12 = 3
```

---

## Time Complexity

```
O(n)
```

---

## Space Complexity

```
O(1)
```

---

## Concepts Learned

- Arrays
- Mathematical Formula
- Efficient Problem Solving
- Time Complexity Optimization

---

## Platform

GeeksforGeeks

## Language

Java

## Status

✅ Solved
