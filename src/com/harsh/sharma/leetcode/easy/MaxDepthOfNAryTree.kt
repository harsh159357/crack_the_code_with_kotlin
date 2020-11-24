package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.Node
import java.util.*

/*

    559. Maximum Depth of N-ary Tree

    https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

 */

fun maxDepth(root: Node?): Int {
    if (root == null) {
        return 0
    }
    var res = 0
    val queue = LinkedList<Node>()
    queue.offer(root)
    while (queue.isNotEmpty()){
        res++
        val size = queue.size
        for (i in size-1 downTo 0){
            val cur = queue.poll()
            if (cur!=null){
                for (item in cur.children){
                    queue.offer(item)
                }
            }
        }
    }
    return res
}
