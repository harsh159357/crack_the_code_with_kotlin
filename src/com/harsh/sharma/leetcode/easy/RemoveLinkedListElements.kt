package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.ListNode

/*

    203. Remove Linked List Elements

    https://leetcode.com/problems/remove-linked-list-elements/

 */

fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    val dummyHead = ListNode(-1)
    dummyHead.next = head
    var pre: ListNode? = dummyHead
    while (pre != null) {
        if (pre.next?.`val` == `val`) {
            pre.next = pre.next?.next
            continue
        }
        pre = pre.next
    }
    return dummyHead.next
}

fun removeElementsRecursive(head: ListNode?, `val`: Int): ListNode? {
    return if (head?.`val` == `val`)
        removeElementsRecursive(head.next, `val`)
    else {
        head?.next = removeElementsRecursive(head?.next, `val`)
        head
    }
}

