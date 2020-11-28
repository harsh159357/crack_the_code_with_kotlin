package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.TreeNode
import kotlin.math.max

/*

    543. Diameter of Binary Tree

    https://leetcode.com/problems/diameter-of-binary-tree/

 */

var ans = 0
fun diameterOfBinaryTree(root: TreeNode?): Int {
    ans = 1
    depth(root)
    return ans - 1
}

fun depth(node: TreeNode?): Int {
    if (node == null) return 0
    val l = depth(node.left)
    val r = depth(node.right)
    ans = max(ans, l + r + 1)
    return max(l, r) + 1
}