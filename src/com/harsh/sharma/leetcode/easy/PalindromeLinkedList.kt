package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.ListNode

/*

    234. Palindrome Linked List

    https://leetcode.com/problems/palindrome-linked-list/

 */

fun isPalindrome(head: ListNode?): Boolean {
    var p1 = head
    var p2 = head
    while (p2 != null) {
        p1 = p1?.next
        p2 = p2.next?.next
    }
    p1 = reverse(p1)

    p2 = head
    while (p1 != null) {
        if (p1.`val` != p2?.`val`) {
            return false
        }
        p1 = p1.next
        p2 = p2.next
    }
    return true
}

private fun reverse(head: ListNode?): ListNode? {
    var curr = head
    var prev: ListNode? = null

    while (curr != null) {
        val next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }
    return prev
}
