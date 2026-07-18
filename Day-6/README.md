# Day 6 - Left Rotate Array by K Places

## Problem Statement

Given an array of size N and an integer K, rotate the array to the left by K positions.

### Example

Input:
```
arr = [1,2,3,4,5]
k = 2
```

Output:
```
[3,4,5,1,2]
```

---

## Brute Force Approach

### Idea

- Store the first K elements in a temporary array.
- Shift the remaining elements to the left.
- Copy the stored elements to the end of the array.

---

## Algorithm

1. Calculate `k = k % n`.
2. Store the first `k` elements in a temporary array.
3. Shift the remaining elements to the left by `k` positions.
4. Copy the temporary array elements to the end.

---

## Dry Run

Input:

```
[1,2,3,4,5]
k = 2
```

Store first K elements:

```
temp = [1,2]
```

Shift remaining elements:

```
3 4 5 _ _
```

Copy temp elements:

```
3 4 5 1 2
```

Final Output:

```
[3,4,5,1,2]
```

---

## Time Complexity

O(n)

## Space Complexity

O(k)

---

## Concepts Learned

- Arrays
- Array Rotation
- Temporary Array
- Modulo Operation (`k % n`)
- Array Traversal
- Dry Run
- Time & Space Complexity

---

## Platform

GeeksforGeeks

## Language

Java

## Status

✅ Solved
