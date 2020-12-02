package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.Node

/*

    590. N-ary Tree Postorder Traversal

    https://leetcode.com/problems/n-ary-tree-postorder-traversal/

 */

fun postorder(root: Node?): List<Int> {
    var list = ArrayList<Int>()
    if (root == null) {
        return list
    }
    postorder(root, list)
    return list
}

fun postorder(root: Node, list: ArrayList<Int>) {
    for (e in root.children) {
        if (e != null) {
            postorder(e, list)
        }
    }
    list.add(root.`val`)
}
