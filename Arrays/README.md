# Arrays

Core idea: index-based access, sliding window, two pointers, prefix sums.

## Problems

<details>
<summary>1_search_element.java — Search an element in an array</summary>

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

<summary>2_find_max.java — Find maximum element in array.</summary>

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

<summary>3_take_discount_or_not.java</summary>

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
