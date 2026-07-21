# 🚀 Day 9 - Union of Two Sorted Arrays (Brute Force)

## Problem Statement

Given two sorted arrays, return the union of both arrays in sorted order without duplicates.

---

## Example

Input

```
a = [1,2,2,3]
b = [2,3,4]
```

Output

```
[1,2,3,4]
```

---

## Brute Force Approach

Use a **TreeSet** to:

- Remove duplicate elements.
- Keep all elements in sorted order automatically.

Insert all elements from both arrays into the TreeSet and then convert it into an ArrayList.

---

## Algorithm

1. Create a TreeSet.
2. Insert every element from the first array.
3. Insert every element from the second array.
4. Convert the TreeSet into an ArrayList.
5. Return the ArrayList.

---

## Dry Run

Input

```
a = [1,2,2,3,5]
b = [2,3,4,5,6]
```

TreeSet

```
1
2
3
4
5
6
```

Output

```
[1,2,3,4,5,6]
```

---

## Time Complexity

O((n + m) log(n + m))

---

## Space Complexity

O(n + m)

---

## Concepts Learned

- TreeSet
- Union of Arrays
- Removing Duplicates
- Java Collections Framework
- ArrayList
- Brute Force Approach

---

## Platform

GeeksforGeeks

## Language

Java

## Status

✅ Solved
