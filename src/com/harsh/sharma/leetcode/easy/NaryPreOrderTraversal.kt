package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.Node

/*

    589. N-ary Tree Preorder Traversal

    https://leetcode.com/problems/n-ary-tree-preorder-traversal/

 */

fun preorder(root: Node, list:ArrayList<Int>) {
    list.add(root.`val`)
    for(e in root.children) {
        if(e != null) {
            preorder(e, list)
        }
    }
}

fun preorder(root: Node?): List<Int> {
    var list = ArrayList<Int>()
    if(root == null) {
        return list
    }
    preorder(root, list)
    return list
}