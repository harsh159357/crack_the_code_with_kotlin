package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.TreeNode
import java.util.*


/*

    637. Average of Levels in Binary Tree

    https://leetcode.com/problems/average-of-levels-in-binary-tree/

 */

fun averageOfLevels(root: TreeNode?): List<Double>? {
    val count: MutableList<Int> = ArrayList()
    val res: MutableList<Double> = ArrayList()
    average(root, 0, res, count)
    for (i in res.indices) res[i] = res[i] / count[i]
    return res
}

fun average(t: TreeNode?, i: Int, sum: MutableList<Double>, count: MutableList<Int>) {
    if (t == null) return
    if (i < sum.size) {
        sum[i] = sum[i] + t.`val`
        count[i] = count[i] + 1
    } else {
        sum.add(1.0 * t.`val`)
        count.add(1)
    }
    average(t.left, i + 1, sum, count)
    average(t.right, i + 1, sum, count)
}

fun averageOfLevels2(root: TreeNode?): List<Double>? {
    val res: MutableList<Double> = ArrayList()
    var queue: Queue<TreeNode> = LinkedList<TreeNode>()
    queue.add(root)
    while (!queue.isEmpty()) {
        var sum: Long = 0
        var count: Long = 0
        val temp: Queue<TreeNode> = LinkedList<TreeNode>()
        while (!queue.isEmpty()) {
            val n = queue.remove()
            sum += n!!.`val`
            count++
            if (n.left != null) temp.add(n.left)
            if (n.right != null) temp.add(n.right)
        }
        queue = temp
        res.add(sum * 1.0 / count)
    }
    return res
}