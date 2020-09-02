package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.TreeNode

/*

    104. Maximum Depth of Binary Tree

    https://leetcode.com/problems/maximum-depth-of-binary-tree/

 */
class MaxDepthOfBinaryTree {

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}