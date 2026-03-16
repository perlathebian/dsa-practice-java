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

<details>
<summary>Ex2_reversing_words.java - Reverse the order of the words in the string</summary>

**Problem:** The characters inside each word should remain in the same order, but the positions of the words should be reversed. The final output must follow strict formatting rules: there should be exactly one space between words, and there should be no spaces at the beginning or end of the result.

**Approach 1:** Brute Force

**Idea:** Split the string based on spaces, which produces an array of words.
Steps:

1. Split the string using " ".
2. Traverse the array from end to beginning.
3. Ignore empty strings.
4. Append valid words to the result with a single space.

**Time:** O(N)

**Space:** O(N)

**Approach 2:** Using Stack

**Idea:** A stack naturally reverses order because it is Last In First Out (LIFO).
Steps:

1. Extract words
2. Push them into a stack
3. Pop them to reverse order
4. Join with spaces

**Time:** O(N)

**Space:** O(N)

**Approach 3:** Two Pointer Manual Parsing

**Idea:** Instead of using split() (which internally allocates memory), we scan the string from right to left and extract words manually.
Steps:

1. Start from the end of the string
2. Skip spaces
3. Identify a word
4. Append it to result
5. Continue moving left
   This avoids creating intermediate arrays.

**Time:** O(N)

**Space:** O(1)

</details>

<details>
<summary>Ex3_remove_parantheses.java - Remove outermost parantheses.</summary>

**Problem:** Given a string that contains only parentheses '(' and ')'. The string is guaranteed to be valid, meaning every opening parenthesis has a matching closing parenthesis and the structure is properly balanced.
Inside this string, there may be several primitive valid parentheses substrings. A primitive substring is a valid parentheses string that cannot be split into two smaller valid parentheses strings.
Example: ()() → two primitives: "()" and "()"
Each primitive has an outermost pair of parentheses that wraps the entire primitive.
Your task is to remove the outermost parentheses from every primitive substring while keeping the internal parentheses intact.

**Approach 1:** Primitive Splitting (Brute Force)

**Idea:** We identify each primitive substring first.
A primitive ends whenever the balance counter becomes zero again.

**Time:** O(N) - scanning the string once

**Space:** O(N) - storing substrings

**Approach 2:** Depth Counter (Optimal)

**Idea:**Instead of explicitly splitting primitives, we directly ignore the outermost parentheses while scanning. We maintain a depth counter.
Rules:
When we see '(':
If depth > 0, keep it.
Then increase depth.
When we see ')':
First decrease depth.
If depth > 0, keep it.
This works because the outermost parentheses correspond exactly to depth transitions:
0 to 1
1 to 0

**Time:** O(N)

**Space:** O(N)

**Approach 3:** Using Stack

**Idea:** A stack naturally tracks nested structures.
The outermost parentheses of a primitive occur when the stack size is 1.
Example:
((()))
Stack sizes while scanning:
( → size 1 ← outermost
( → size 2
( → size 3
) → size 2
) → size 1
) → size 0 ← outermost closing

So we skip parentheses when the stack size is 1, because those correspond to the outer layer.

**Time:** O(N)

**Space:** O(N)

</details>
