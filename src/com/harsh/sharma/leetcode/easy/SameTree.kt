package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.TreeNode

/*

    100. Same Tree

    https://leetcode.com/problems/same-tree/

 */

// Fastest Solution Available
fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean =
    (p == null && q == null) ||
            ((p?.`val` == q?.`val`) &&
                    isSameTree(p?.left, q?.left) &&
                    isSameTree(p?.right, q?.right))

