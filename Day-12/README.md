# 🚀 Day 12 - Maximum Consecutive Ones

## Problem Statement

Given a binary array `nums`, return the maximum number of consecutive 1's.

---

## Example

Input

nums = [1,1,0,1,1,1]

Output

3

---

## Approach

Explain in 4-5 lines how you solved it.

Example:

Traverse the array once.
Increase count when the current element is 1.
Reset count when the current element is 0.
Maintain the maximum count throughout the traversal.

---

## Algorithm

1. Initialize count = 0.
2. Initialize maxCount = 0.
3. Traverse the array.
4. If element is 1, increment count.
5. Update maxCount.
6. If element is 0, reset count.
7. Return maxCount.

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## Concepts Learned

- Array Traversal
- Counting Consecutive Elements
- Time Complexity

---

## Platform

LeetCode 485

---

## Language

Java

---

## Status

✅ Solved
