package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.TreeNode

/*

    572. Subtree of Another Tree

    https://leetcode.com/problems/subtree-of-another-tree/

 */

fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
    if (s == null) return t == null
    if (isSameTree(s, t)) return true
    return isSubtree(s.left, t) || isSubtree(s.right, t)
}
