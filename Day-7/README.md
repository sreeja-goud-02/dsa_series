# 🚀 Day 7 - Move Zeroes

## Problem

Given an integer array, move all the zeroes to the end while maintaining the relative order of the non-zero elements.

### Example

Input

```
[0,1,0,3,12]
```

Output

```
[1,3,12,0,0]
```

---

## Approach

This problem is solved using the **Two Pointer Technique**.

- `z` points to the position where the next non-zero element should be placed.
- `nz` traverses the array to find non-zero elements.
- Whenever a non-zero element is found, it is swapped with the element at `z`.
- This keeps all non-zero elements together while pushing zeroes to the end.

---

## Algorithm

1. Initialize two pointers `z = 0` and `nz = 0`.
2. Traverse the array using `nz`.
3. If the current element is non-zero:
   - Swap `nums[z]` and `nums[nz]`.
   - Increment `z`.
4. Continue until the end of the array.

---

## Time Complexity

O(n)

## Space Complexity

O(1)

---

## Concepts Learned

- Two Pointer Technique
- Array Traversal
- Swapping
- In-place Modification


---

## Platform

LeetCode

## Language

Java

## Status

✅ Solved
