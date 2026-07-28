# 📘 Day 13 - LeetCode 136: Single Number

## 📝 Problem Statement

Given a **non-empty integer array** `nums`, every element appears **twice** except for one element. Find that single element.

### Example

**Input:**
```text
nums = [4,1,2,1,2]
```

**Output:**
```text
4
```

---

# 🚀 Approaches

## 1️⃣ Brute Force Approach

### 💡 Intuition
For every element, count its frequency by traversing the entire array. If the frequency is `1`, return that element.

### 📌 Algorithm
1. Traverse the array.
2. For each element, count its occurrences using another loop.
3. If the frequency is `1`, return that element.

### ⏱️ Time Complexity
**O(n²)**

### 💾 Space Complexity
**O(1)**

---

## 2️⃣ Better Approach (HashMap / Hashing)

### 💡 Intuition
Instead of counting the frequency repeatedly, store the frequency of every element in a HashMap. Then, return the element whose frequency is `1`.

### 📌 Algorithm
1. Create an empty HashMap.
2. Traverse the array and store the frequency of every element.
3. Traverse the array again.
4. Return the element whose frequency is `1`.

### ⏱️ Time Complexity
**O(n)**

### 💾 Space Complexity
**O(n)**

---

## 📚 Concepts Learned

- Arrays
- Nested Loops
- Hashing
- HashMap
- Frequency Counting
- Time Complexity
- Space Complexity
- Problem Optimization

---

## 📊 Complexity Comparison

| Approach | Time Complexity | Space Complexity |
|----------|-----------------|------------------|
| Brute Force | O(n²) | O(1) |
| HashMap (Better) | O(n) | O(n) |
| XOR (Optimal) | O(n) | O(1) *(To be added)* |

---

## 🎯 Learning Outcome

From this problem, I learned:

- How to solve a problem using the Brute Force approach.
- How HashMap can be used for frequency counting.
- The concept of Hashing in Java.
- How to optimize a solution from **O(n²)** to **O(n)**.
- The importance of analyzing Time and Space Complexity.

---

## 🛠️ Language Used

- Java

---

## 📌 Problem Link

**LeetCode 136 - Single Number**

---

## 📅 Status

- ✅ Brute Force Completed
- ✅ Better Approach (HashMap) Completed
- ⏳ Optimal Approach (XOR) - Coming Next

---

### ⭐ Keep Learning, Keep Coding! 🚀
