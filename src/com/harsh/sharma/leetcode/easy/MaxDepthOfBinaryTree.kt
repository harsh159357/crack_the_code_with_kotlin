package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.TreeNode

/*

    104. Maximum Depth of Binary Tree

    https://leetcode.com/problems/maximum-depth-of-binary-tree/

 */

fun maxDepth(root: TreeNode?): Int {
    if (root == null) {
        return 0;
    }

    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
}

