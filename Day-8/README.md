# 🚀 Day 8 - Linear Search

## Problem Statement

Given an array of integers and a target element `x`, return the index of the first occurrence of `x`. If the element is not present, return `-1`.

---

## Example

Input

```
arr = [1,2,3,4]
x = 3
```

Output

```
2
```

---

## Approach

Linear Search checks every element from left to right until the target element is found.

If the element is found, return its index immediately.

If the entire array is traversed and the element is not found, return `-1`.

---

## Algorithm

1. Traverse the array from index `0`.
2. Compare each element with `x`.
3. If they are equal, return the current index.
4. If the loop finishes without finding the element, return `-1`.

---

## Dry Run

Input

```
arr = [5,8,10,15]
x = 10
```

Comparisons

```
5 ❌
8 ❌
10 ✅
```

Return

```
2
```

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## Concepts Learned

- Linear Search
- Array Traversal
- Loops
- Conditional Statements
- Time Complexity
- Space Complexity

---

## Platform

GeeksforGeeks

## Language

Java

## Status

✅ Solved
