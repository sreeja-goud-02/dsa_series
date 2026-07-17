# Day 5 - Left Rotate Array by One

## Problem Statement
Given an array, rotate it to the left by one position.

### Example

Input:
[1, 2, 3, 4, 5]

Output:
[2, 3, 4, 5, 1]

## Approach

1. Store the first element in a temporary variable.
2. Shift all remaining elements one position to the left.
3. Place the first element at the last position.

## Algorithm

- Store the first element.
- Traverse from index 1 to n-1.
- Shift each element one position left.
- Place the stored element at the end.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Concepts Learned

- Arrays
- Array Rotation
- In-place Modification

Status: ✅ Solved

Platform: Code360

Language: Java
