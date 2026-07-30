# Day 14 – Two Sum (Pair with Given Sum)

## 📌 Problem
Given an integer array `arr[]` and an integer `target`, determine whether there exist two distinct indices such that the sum of their elements is equal to the target.

**Problem Link:** https://www.geeksforgeeks.org/problems/key-pair5616/1

---

## 🧠 Approaches Learned

### 1️⃣ Brute Force
- Check every possible pair using nested loops.
- If any pair sums to the target, return `true`.

**Time Complexity:** O(n²)

**Space Complexity:** O(1)

---

### 2️⃣ Better Approach (HashMap)
- Traverse the array once.
- Calculate the complement:

**Time Complexity:** O(n)

**Space Complexity:** O(n)

---

### 3️⃣ Optimal Approach (Two Pointers)
> Applicable only when the array is sorted or sorting is allowed.

- Sort the array.
- Initialize two pointers:
- Left = 0
- Right = n - 1
- Compare the sum with the target.
- Move pointers based on the comparison.

**Time Complexity:** O(n log n)

**Space Complexity:** O(1)

---

## 💡 Key Concepts Learned

- Brute Force vs Optimized Solutions
- HashMap (Key → Value)
- Complement Technique
- Number → Index Mapping
- Two Pointer Technique
- Sorting + Two Pointers
- Time Complexity Optimization

---

## 📚 What I Learned

- Solved the Two Sum problem using three different approaches.
- Understood why HashMap reduces the time complexity from O(n²) to O(n).
- Learned how the Two Pointer technique works on sorted arrays.
- Understood why the HashMap solution is considered optimal for the original LeetCode Two Sum problem that requires original indices.
- Strengthened my understanding of algorithm optimization and choosing the right data structure.

---

## 🚀 Progress

✅ Problem Solved

✅ Concepts Revised

✅ Ready for the Next DSA Problem
