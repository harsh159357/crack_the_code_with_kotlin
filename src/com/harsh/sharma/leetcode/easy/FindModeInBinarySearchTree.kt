package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.TreeNode

/*

    501. Find Mode in Binary Search Tree

    https://leetcode.com/problems/find-mode-in-binary-search-tree/

 */

fun findMode(root: TreeNode?): IntArray {
    val map = HashMap<Int, Int>();
    addElementIntoMap(root, map)
    var maxIndex = 0
    for (mutableEntry in map) {
        if (mutableEntry.value > maxIndex) {
            maxIndex = mutableEntry.value
        }
    }
    val mutableListOf = mutableListOf<Int>()
    for (mutableEntry in map) {
        if (mutableEntry.value == maxIndex) {
            mutableListOf.add(mutableEntry.key)
        }
    }
    return mutableListOf.toIntArray()
}

private fun addElementIntoMap(root: TreeNode?, map: HashMap<Int, Int>) {
    if (root != null) {
        var times = map[root.`val`]
        if (times != null) {
            map[root.`val`] = times + 1

        } else {
            map[root.`val`] = 0
        }
        addElementIntoMap(root.left, map)
        addElementIntoMap(root.right, map)
    }
}