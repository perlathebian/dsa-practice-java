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

</details>
