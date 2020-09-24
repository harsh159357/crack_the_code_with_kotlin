package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.TreeNode
import java.util.*


/*

    226. Invert Binary Tree

    https://leetcode.com/problems/invert-binary-tree/

 */

fun invertTreeRecursive(root: TreeNode?): TreeNode? {
    if (root == null) {
        return null
    }
    val right: TreeNode? = invertTreeRecursive(root.right)
    val left: TreeNode? = invertTreeRecursive(root.left)
    root.left = right
    root.right = left
    return root
}

fun invertTreeIterative(root: TreeNode?): TreeNode? {
    if (root == null) return null
    val queue: Queue<TreeNode> = LinkedList<TreeNode>()
    queue.add(root)
    while (!queue.isEmpty()) {
        val current: TreeNode = queue.poll()
        val temp = current.left
        current.left = current.right
        current.right = temp
        if (current.left != null) queue.add(current.left)
        if (current.right != null) queue.add(current.right)
    }
    return root
}