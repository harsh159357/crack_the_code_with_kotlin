package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.ListNode
import java.util.*


/*

    141. Linked List Cycle

    https://leetcode.com/problems/linked-list-cycle/

 */

fun hasCycleHashTable(head: ListNode?): Boolean {
    var head = head
    val nodesSeen: MutableSet<ListNode> = HashSet()
    while (head != null) {
        if (nodesSeen.contains(head)) {
            return true
        } else {
            nodesSeen.add(head)
        }
        head = head.next
    }
    return false
}

fun hasCycleTwoPointers(head: ListNode?): Boolean {
    if (head?.next == null) {
        return false
    }
    var slow = head
    var fast = head.next
    while (slow != fast) {
        if (fast?.next == null) {
            return false
        }
        slow = slow!!.next
        fast = fast.next!!.next
    }
    return true
}