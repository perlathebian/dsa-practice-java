# Arrays

Core idea: index-based access, sliding window, two pointers, prefix sums.

## Problems

<details>
<summary>ex1_search_element.java — Search an element in an array</summary>

**Approach 1:** Brute Force (Linear Search)

**Idea:** Check every element one by one.
Steps:

```
for each element in array
    if element == X
        return YES
return NO
```

**Time Complexity:** O(N)

**Space Complexity:** O(1) for variable

**Approach 2:** HashSet Lookup (Improved for Multiple Queries)

**Idea:** Store all elements in a HashSet for faster lookups, then check if X exists.
Steps:

```
insert all elements into HashSet
check if X exists
```

But for one query, this is not better.

**Time Complexity:** O(N)

**Space Complexity:** O(N) - unnecessary here

**Approach 3:** Binary Search (Optimal if Sorted)

**Idea:** If the array were sorted, we could use binary search. Then we repeatedly divide the search space.

**Time Complexity:** O(N log N): O(log N) - for binary search + O(N log N) for sorting

</details>

<details>

<summary>ex2_find_max.java — Find maximum element in array.</summary>

**Approach 1:** Linear Search

**Idea:** Traverse the array and track the largest element seen so far.
Steps:

```
max = first element

for each element
    if element > max
        max = element
```

**Time Complexity:** O(N)

**Space Complexity:** O(1) for variable

**Approach 2:** Sorting
**Idea:** Sort the array. The last element will be the maximum.
Steps:

```
sort array
print last element
```

**Time Complexity:** O(N log N) - slower than needed

**Approach 3:** Using Java Built-in Streams

**Idea:** Arrays.stream(arr).max()

</details>

<details>

<summary>ex3_take_discount_or_not.java - Buying Coupon or Not</summary>

**Problem**: There are N items in a shop. You know that the price of the i-th item is $A_i$​. Chef wants to buy all the N items. There is also a discount coupon that costs X and reduces the cost of every item by
Y. If the price of an item was initially ≤ Y, it becomes free, i.e, costs 0.

Determine whether Chef should buy the discount coupon or not. Chef will buy the discount coupon if and only if the total price he pays after buying the discount coupon is strictly less than the price he pays without buying the discount coupon.

**Approach 1**: Two Passes

**Idea**: Compute total price without coupon. Compute total price with coupon by applying the discount to every item. Add coupon cost X. Compare the two totals.

**Time complexity**: O(N)

**Space**: O(N) - if we store array

**Approach 2**: One Pass (improved, optimal)

**Idea**: CCompute both totals simultaneously while reading the items.

**Time complexity**: O(N)

**Space**: O(1)

</details>

<details>

<summary>ex4_cost_of_groceries.java - Total Cost</summary>

**Problem**: Chef visited a grocery store for fresh supplies. There are N items in the store where the ith item has a freshness value $A_i$ and cost $B_i$. Chef has decided to purchase all the items having a freshness value greater than equal to X. Find the total cost of the groceries Chef buys.

**Approach 1**: Brute Force (Store Arrays)
Steps:
Read array A
Read array B
Loop through indices
If A[i] ≥ X, add B[i]

**Idea**:

```
total = 0

for i from 0 to N-1
    if A[i] ≥ X
        total += B[i]
```

**Time complexity**: O(N)

**Space**: O(N) - both arrays

**Approach 2**: One Pass While Reading

**Idea**: Instead of storing arrays, we can process values immediately.
Steps:
Read A[i] values
Store them temporarily
When reading B[i], apply condition and sum
But since input gives two separate arrays, we typically store at least one.
Time complexity remains the same.

**Time complexity**: O(N)

**Space**: O(N) - one array (slightly reduced)

</details>

<details>
<summary>ex5_is_array_sorted.java - Return Whether Input Array is Sorted</summary>

**Problem**: Given an array nums which is rotated. You have to find out if the given array is sorted and rotated.
An array is considered sorted and rotated if:

- There exists a non-decreasing sorted array A.
- After rotating A by some k positions (possibly k=0), we obtain the given array nums.
- Rotation means some suffix of A is moved to the front, keeping the relative order of elements.

A valid sorted-rotated array can have AT MOST ONE drop.

**Approach 1**: Brute Force (Simulate All Rotations)

**Idea**: Rotate the array k times.
After each rotation, check if the array becomes sorted.
If any rotation is sorted, return true.

Pseudo logic:

```
for k from 0 to N-1
    rotate array by k
    check if sorted
```

**Time complexity**: $O(N^2)$ - N rotations × N checks

**Space**: O(N)

**Approach 2**: Count Order Violations (Optimal)

**Idea**: Count how many times the order decreases.
If

```
drops ≤ 1 → true
Else → false
```

**Time complexity**: O(N)

**Space**: O(1)

</details>

<details>
<summary>ex6_min_to_max.java - Return minimum number of operations to make minimum value in an array the maximum.</summary>

**Problem**: Determine the minimum number of operations required to make M the miniimum value in the array A become the maximum value.

**Approach**: First find the minimum, then count how many numbers are greater than it.

**Idea**:
For each element:
Check if it is greater than M.
If yes, change it to M.
Each such change counts as one operation.
Since we can set the value to any number, we can directly set it to M.

**Time**: O(N) - (one pass to find minimum, one pass to count)

**Space**: O(1)

</details>

<details>
<summary>ex7_running_comparison.java - Compare values in 2 arrays.</summary>

**Problem**: Alice and Bob recently got into running, and decided to compare how much they ran on different days. Alice is unhappy if Bob ran a distance strictly more than twice that Alice ran. Same for Bob. Both are happy if condition doesn't happen.

**Approach**: Direct Condition Check

**Idea**: For each day:
Check if Alice would be unhappy.
Check if Bob would be unhappy.
If neither is unhappy, count the day.

**Time**: O(N) - We check each day once.

**Space**: O(1)

</details>

<details>
<summary>ex8_single_number.java - Return single number in multiple numbers.</summary>

**Problem**: Given an array of numbers, every number appears twice except one number that appears once. Return that number.

**Approach 1**: Brute Force (Nested Loop)

**Idea**: For each element, count how many times it appears in the array.
If the count is 1, return it.

**Time**: $O(N^2)$

**Space**: O(1)

**Approach 2**: HashSet / HashMap

**Idea**: Track occurrences using a data structure. HashMap mapping number to its frequency.
Then find the number with frequency = 1.

**Time**: O(N)

**Space**: O(N)

**Approach 3**: XOR Trick (Optimal)

**Idea**: Key XOR properties: a ^ a = 0 and a ^ 0 = a
XOR is associative and commutative
Example: 9 1 9 2 1
Compute XOR step by step: 9 ^ 1 ^ 9 ^ 2 ^ 1
Rearrange: (9 ^ 9) ^ (1 ^ 1) ^ 2
Pairs cancel: 0 ^ 0 ^ 2
Result: 2
So the unique number remains.

**Time**: O(N)

**Space**: O(1)

</details>

<details>
<summary>ex9_largest_number.java - Largest and second largest.</summary>

**Problem**: Return the largest possible sum of two distinct integers from the array. We need largest value and second largest value (different from largest).

**Approach 1**: Brute Force (Check All Pairs)

**Idea**: Check every pair (i, j).
If the numbers are different values, compute their sum.
Keep track of the maximum sum.

**Time**: $O(N^2)$

**Space**: O(1)

**Approach 2**: Sorting

**Idea**: Sort the array.
The largest element will be at the end.
Move left until we find a value different from it.

**Time**: O(N log N)

**Space**: O(1) - if sorting in-place

**Approach 3**: Single Pass Tracking (Optimal)

**Idea**: While scanning the array:

- If number > largest, update both values
- If number < largest but > secondLargest, update secondLargest

**Time**: O(N)

**Space**: O(1)

</details>
