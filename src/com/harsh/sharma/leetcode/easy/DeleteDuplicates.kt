package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.ListNode


fun deleteDuplicates(head: ListNode?): ListNode? {
    var current = head
    while (current?.next != null) {
        if (current.next!!.`val` == current.`val`) {
            current.next = current.next!!.next
        } else {
            current = current.next
        }
    }
    return head
}

fun main() {
    deleteDuplicates(ListNode.of(1, 2, 3, 3))?.printAll()
    deleteDuplicates(ListNode.of(1, 1, 2))?.printAll()
}