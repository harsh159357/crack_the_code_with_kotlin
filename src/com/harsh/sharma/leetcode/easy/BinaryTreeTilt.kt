package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.TreeNode

/*

    563. Binary Tree Tilt

    https://leetcode.com/problems/binary-tree-tilt/

 */

var totalTilt = 0

fun valueSum(node: TreeNode?): Int {
    if (node == null) return 0
    val leftSum: Int = valueSum(node.left)
    val rightSum: Int = valueSum(node.right)
    val tilt = Math.abs(leftSum - rightSum)
    totalTilt += tilt

    // return the sum of values starting from this node.
    return node.`val` + leftSum + rightSum
}

fun findTilt(root: TreeNode?): Int {
    totalTilt = 0
    valueSum(root)
    return totalTilt
}