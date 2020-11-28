package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.TreeNode

/*

    108. Convert Sorted Array to Binary Search Tree

    https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

 */



fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return bstBuilder(nums, 0, nums.size - 1)
}

fun bstBuilder(nums: IntArray, left: Int, right: Int): TreeNode? {
    if (left > right) return null
    val mid = (left + right + 1) / 2
    val root = TreeNode(nums[mid])
    if (left == right) return root
    root.left = bstBuilder(nums, left, mid - 1)
    root.right = bstBuilder(nums, mid + 1, right)
    return root
}
