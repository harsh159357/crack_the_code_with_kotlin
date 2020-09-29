package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.ListNode




/*

    237. Delete Node in a Linked List

    https://leetcode.com/problems/delete-node-in-a-linked-list/

 */

fun deleteNode(node: ListNode?) {
    node!!.`val` = node?.next!!.`val`
    node.next = node?.next!!.next
}