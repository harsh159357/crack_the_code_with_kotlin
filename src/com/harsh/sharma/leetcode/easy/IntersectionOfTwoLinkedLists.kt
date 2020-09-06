package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.ListNode

/*

    160. Intersection of Two Linked Lists

    https://leetcode.com/problems/intersection-of-two-linked-lists/

 */

fun getIntersectionNodeOne(headA: ListNode?, headB: ListNode?): ListNode? {
    //boundary check
    if (headA == null || headB == null) return null
    var a = headA
    var b = headB

    //if a & b have different len, then we will stop the loop after second iteration
    while (a != b) {
        //for the end of first iteration, we just reset the pointer to the head of another linkedList
        a = if (a == null) headB else a.next
        b = if (b == null) headA else b.next
    }
    return a
}

fun getIntersectionNodeTwo(headA: ListNode?, headB: ListNode?): ListNode? {

    var p1 = headA
    var p2 = headB
    var len1 = 0
    var len2 = 0
    while (p1 != null) {
        p1 = p1.next
        len1++
    }
    while (p2 != null) {
        p2 = p2.next
        len2++
    }
    p1 = headA
    p2 = headB
    if (len1 > len2) {
        for (i in 0 until len1 - len2) {
            p1 = p1!!.next
        }
    } else {
        for (i in 0 until len2 - len1) {
            p2 = p2!!.next
        }
    }
    while (p1 != p2) {
        p1 = p1!!.next
        p2 = p2!!.next
    }
    return p1
}