package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.TreeNode

/*

    112. Path Sum

    https://leetcode.com/problems/path-sum/

 */
fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
    return hasPathDfs(root, 0, sum)
}

fun hasPathDfs(root: TreeNode?, sum: Int, target: Int): Boolean {
    if (root == null) return false
    val sum = sum + root.`val`
    if (sum == target && root.left == null && root.right == null) return true
    val exists = hasPathDfs(root.left, sum, target)
    return if (exists) true else hasPathDfs(root.right, sum, target)
}
