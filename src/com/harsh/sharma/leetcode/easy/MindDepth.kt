package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.TreeNode

/*

    111. Minimum Depth of Binary Tree

    https://leetcode.com/problems/minimum-depth-of-binary-tree/

 */

fun minDepth(root: TreeNode?): Int {
    if (root==null){
        return 0
    }
    return when {
        root.left==null -> {
            minDepth(root.right)+1
        }
        root.right==null -> {
            minDepth(root.left)+1
        }
        else -> {
            minOf(minDepth(root.left),minDepth(root.right))+1
        }
    }
}