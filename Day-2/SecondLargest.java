# 📅 Day 2 - Arrays

## 📘 Topic
Arrays

## 💻 Problem Solved
**Second Largest Element in an Array**

## 📝 Problem Statement
Given an array of positive integers, find the second largest distinct element.
If no second largest element exists, return -1.

## 🧠 Approach

- Initialize two variables:
  - `largest = -1`
  - `secondLargest = -1`
- Traverse the array only once.
- If the current element is greater than `largest`:
  - Move the old `largest` to `secondLargest`.
  - Update `largest`.
- Otherwise, if the current element is:
  - greater than `secondLargest`
  - and smaller than `largest`
  then update `secondLargest`.

## ⏱ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

## 🎯 Key Learning

- Learned how to maintain two maximum values during a single traversal.
- Understood how to handle duplicate largest elements.
- Learned the importance of debugging edge cases.

---
⭐ Day 2 Completed Successfully!
