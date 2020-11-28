package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.TreeNode

/*

    404. Sum of Left Leaves

    https://leetcode.com/problems/sum-of-left-leaves/

 */

private fun isLeaf(node: TreeNode) = node.left != null && node.left?.left == null && node.left?.right == null

fun sumOfLeftLeaves(root: TreeNode?): Int {
    var count = 0
    if (root == null)
        return count

    count += when (isLeaf(root)) {
        true -> root.left?.`val` ?: 0
        false -> sumOfLeftLeaves(root.left)
    }

    count += sumOfLeftLeaves(root.right);
    return count
}
