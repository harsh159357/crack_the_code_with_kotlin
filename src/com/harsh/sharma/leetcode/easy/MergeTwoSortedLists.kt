package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.ListNode

/*

    21. Merge Two Sorted Lists

    https://leetcode.com/problems/merge-two-sorted-lists/

 */
class MergeTwoSortedLists {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var n1 = l1
        var n2 = l2
        var result: ListNode? = null
        var current: ListNode? = null
        while (n1 != null || n2 != null) {
            if (n1 != null && n1.`val` < n2?.`val` ?: Int.MAX_VALUE) {
                current?.next = n1
                current = n1
                n1 = n1.next
            } else if (n2 != null) {
                current?.next = n2
                current = n2
                n2 = n2.next
            }
            if (result == null) {
                result = current
            }
        }
        return result
    }

    fun main() {
        println("${mergeTwoLists(ListNode.of(1, 2, 4), ListNode.of(1, 3, 4))!!.printAll()}")
    }

}
