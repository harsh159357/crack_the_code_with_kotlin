package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.TreeNode
import java.util.*


/*

    617. Merge Two Binary Trees

    https://leetcode.com/problems/merge-two-binary-trees/

 */

fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
    if (t1 == null) return t2
    if (t2 == null) return t1
    t1.`val` += t2.`val`
    t1.left = mergeTrees(t1.left, t2.left)
    t1.right = mergeTrees(t1.right, t2.right)
    return t1
}

fun mergeTrees1(t1: TreeNode?, t2: TreeNode?): TreeNode? {
    if (t1 == null) return t2
    val stack = Stack<Array<TreeNode?>>()
    stack.push(arrayOf(t1, t2))
    while (!stack.isEmpty()) {
        val t = stack.pop()
        if (t[0] == null || t[1] == null) {
            continue
        }
        t[0]!!.`val` += t[1]!!.`val`
        if (t[0]!!.left == null) {
            t[0]!!.left = t[1]!!.left
        } else {
            stack.push(arrayOf(t[0]!!.left, t[1]!!.left))
        }
        if (t[0]!!.right == null) {
            t[0]!!.right = t[1]!!.right
        } else {
            stack.push(arrayOf(t[0]!!.right, t[1]!!.right))
        }
    }
    return t1
}