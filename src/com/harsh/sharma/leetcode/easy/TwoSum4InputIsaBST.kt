package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.TreeNode
import java.util.*


/*

    653. Two Sum IV - Input is a BST

    https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

 */

fun findTarget(root: TreeNode?, k: Int): Boolean {
    val set: MutableSet<Int> = HashSet()
    return find(root, k, set)
}

fun find(root: TreeNode?, k: Int, set: MutableSet<Int>): Boolean {
    if (root == null) return false
    if (set.contains(k - root.`val`)) return true
    set.add(root.`val`)
    return find(root.left, k, set) || find(root.right, k, set)
}

fun findTarget2(root: TreeNode?, k: Int): Boolean {
    val set: MutableSet<Int> = HashSet<Int>()
    val queue: Queue<TreeNode> = LinkedList<TreeNode>()
    queue.add(root)
    while (!queue.isEmpty()) {
        if (queue.peek() != null) {
            val node = queue.remove()
            if (set.contains(k - node!!.`val`)) return true
            set.add(node.`val`)
            queue.add(node.right)
            queue.add(node.left)
        } else queue.remove()
    }
    return false
}

fun findTarget3(root: TreeNode?, k: Int): Boolean {
    val list: MutableList<Int> = ArrayList()
    inorder(root, list)
    var l = 0
    var r = list.size - 1
    while (l < r) {
        val sum = list[l]!! + list[r]!!
        if (sum == k) return true
        if (sum < k) l++ else r--
    }
    return false
}

fun inorder(root: TreeNode?, list: MutableList<Int>) {
    if (root == null) return
    inorder(root.left, list)
    list.add(root.`val`)
    inorder(root.right, list)
}