package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.TreeNode
import java.util.*


/*

    606. Construct String from Binary Tree

    https://leetcode.com/problems/construct-string-from-binary-tree/

 */

fun tree2str(t: TreeNode?): String {
    if (t == null) return ""
    if (t.left == null && t.right == null) return t.`val`.toString() + ""
    return if (t.right == null) t.`val`.toString() + "(" + tree2str(t.left) + ")" else t.`val`.toString() + "(" + tree2str(
        t.left
    ) + ")(" + tree2str(t.right) + ")"
}

fun tree2str1(t: TreeNode): String? {
    var t = t ?: return ""
    val stack = Stack<TreeNode>()
    stack.push(t)
    val visited: MutableSet<TreeNode> = HashSet()
    val s = StringBuilder()
    while (!stack.isEmpty()) {
        t = stack.peek()
        if (visited.contains(t)) {
            stack.pop()
            s.append(")")
        } else {
            visited.add(t)
            s.append("(" + t.`val`)
            if (t.left == null && t.right != null) s.append("()")
            if (t.right != null) stack.push(t.right)
            if (t.left != null) stack.push(t.left)
        }
    }
    return s.substring(1, s.length - 1)
}