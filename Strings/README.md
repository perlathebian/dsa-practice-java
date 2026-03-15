# Strings

## Problems

<details>
<summary>Ex1_dna_storage.java - Convert binary string into a character sequence.</summary>

**Problem:** To perform this conversion, you must read the binary string two characters at a time from left to right. Each pair of bits corresponds to exactly one character according to a fixed mapping.
If the pair is 00, it becomes A.
If the pair is 01, it becomes T.
If the pair is 10, it becomes C.
If the pair is 11, it becomes G.

**Approach 1:** Direct Conditional Mapping (Brute Force)

**Idea:** Iterate through the string in steps of 2.
For every pair:

- Extract S[i] and S[i+1]
- Check which combination they form
- Append the corresponding character

**Time:** O(N)

**Space:** O(N)

**Approach 2:** Using HashMap

**Idea:** Instead of multiple if conditions, store the mappings in a HashMap.

**Time:** O(N)

**Space:** O(1) - map is of constant size

**Approach 3:** Index Mapping

**Idea:** Each pair of bits is basically a 2-bit binary number.
Possible values:
00 → 0
01 → 1
10 → 2
11 → 3
We convert the pair to an integer and use it as an index.

**Time:** O(N)

**Space:** O(1)

</details>
