# 🚀 Day 10 - Union of Two Sorted Arrays (Optimal Two Pointer Approach)

## Problem Statement

Given two sorted arrays, return the union of both arrays in sorted order without duplicates.

---

## Example

Input

```
a = [1,2,2,3,5]
b = [2,3,4,5,6]
```

Output

```
[1,2,3,4,5,6]
```

---

## Optimal Approach (Two Pointers)

Since both arrays are already sorted, we can traverse them simultaneously using two pointers.

- Compare the current elements of both arrays.
- Insert the smaller element into the answer if it is not already present.
- Move the corresponding pointer.
- If both elements are equal, insert only one copy and move both pointers.
- After one array finishes, add the remaining elements from the other array.

---

## Algorithm

1. Initialize two pointers `i = 0` and `j = 0`.
2. Compare `a[i]` and `b[j]`.
3. Add the smaller element to the answer if it is not a duplicate.
4. If both elements are equal, add one copy and move both pointers.
5. Continue until one array is exhausted.
6. Add the remaining elements from the other array.
7. Return the final union.

---

## Time Complexity

O(n + m)

---

## Space Complexity

O(n + m)

---

## Concepts Learned

- Two Pointer Technique
- Sorted Arrays
- Union of Arrays
- Duplicate Handling
- Array Traversal
- Optimal Solution

---

## Platform

GeeksforGeeks

## Language

Java

## Status

✅ Solved
