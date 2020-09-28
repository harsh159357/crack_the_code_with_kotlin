package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.TreeNode

/*

    235. Lowest Common Ancestor of a Binary Search Tree

    https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

 */

fun lowestCommonAncestorRecursive(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    // Value of current node or parent node.
    val parentVal: Int = root!!.`val`

    // Value of p
    val pVal: Int = p!!.`val`

    // Value of q;
    val qVal: Int = q!!.`val`
    return if (pVal > parentVal && qVal > parentVal) {
        // If both p and q are greater than parent
        lowestCommonAncestorRecursive(root.right, p, q)
    } else if (pVal < parentVal && qVal < parentVal) {
        // If both p and q are lesser than parent
        lowestCommonAncestorRecursive(root.left, p, q)
    } else {
        // We have found the split point, i.e. the LCA node.
        root
    }
}

fun lowestCommonAncestorIterative(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    // Value of p
    val pVal = p!!.`val`

    // Value of q;
    val qVal = q!!.`val`

    // Start from the root node of the tree
    var node = root

    // Traverse the tree
    while (node != null) {

        // Value of ancestor/parent node.
        val parentVal = node.`val`
        node = if (pVal > parentVal && qVal > parentVal) {
            // If both p and q are greater than parent
            node.right
        } else if (pVal < parentVal && qVal < parentVal) {
            // If both p and q are lesser than parent
            node.left
        } else {
            // We have found the split point, i.e. the LCA node.
            return node
        }
    }
    return null
}