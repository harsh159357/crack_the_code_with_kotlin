package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.TreeNode


/*

    101. Symmetric Tree

    https://leetcode.com/problems/symmetric-tree/

 */

class SymmetricTree {

    fun isSymmetric(root: TreeNode?): Boolean {
        return isMirror(root, root)
    }

    fun isMirror(t1: TreeNode?, t2: TreeNode?): Boolean {
        if (t1 == null && t2 == null) return true
        return if (t1 == null || t2 == null) false else t1.`val` == t2.`val`
                && isMirror(t1.right, t2.left)
                && isMirror(t1.left, t2.right)
    }

}