package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.TreeNode
import java.util.concurrent.ConcurrentLinkedQueue

/*

    107. Binary Tree Level Order Traversal II

    https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

 */

fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
    var ret = mutableListOf<List<Int>>()
    var queue = ConcurrentLinkedQueue<TreeNode>()
    if(root == null) {
        return ret
    }
    queue.add(root)
    while(queue.isNotEmpty()) {
        var list = mutableListOf<Int>()
        var size = queue.size
        while(size > 0) {
            var node = queue.poll()
            list.add(node.`val`)
            size--
            if(node.left != null) {
                queue.add(node.left)
            }
            if(node.right != null) {
                queue.add(node.right)
            }
        }
        ret.add(0, list)
    }
    return ret
}