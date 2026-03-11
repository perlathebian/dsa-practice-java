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
