# Task 14 - Merge k Sorted Lists

## LeetCode

**Problem:** 23 - Merge k Sorted Lists  
**Week:** 2  
**Session:** 7  
**Topic:** Merge Two Lists  
**Language:** Java  
**Status:** Accepted ✅

## Problem

You are given an array of `k` linked lists, where each linked list
is sorted in ascending order.

Merge all the linked lists into one sorted linked list.

## Approach

A **Priority Queue (Min Heap)** is used to efficiently find the
smallest node among all the linked lists.

1. Add the first node of every non-empty list to the min heap.
2. Remove the smallest node from the heap.
3. Add that node to the result list.
4. If the removed node has a next node, add the next node to the heap.
5. Continue until the heap becomes empty.

## Example

**Input:**

```text
lists = [[1,4,5],[1,3,4],[2,6]]
