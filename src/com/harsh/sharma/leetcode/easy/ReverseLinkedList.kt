package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.ListNode

/*

    206. Reverse Linked List

    https://leetcode.com/problems/reverse-linked-list/

 */

fun reverseList(head: ListNode?): ListNode? {
    var pre:ListNode? = null
    var current = head
    while (current != null) {
        var temp = current.next
        current.next = pre
        pre = current
        current = temp
    }
    return pre
}
