package com.harsh.sharma.leetcode.easy

import java.util.*


/*
6
    225. Implement Stack using Queues

    https://leetcode.com/problems/implement-stack-using-queues/

 */

class MyStack() {
    /** Initialize your data structure here. */
    private var q1: LinkedList<Int?>? = LinkedList()

    /** Push element x onto stack. */
    fun push(x: Int) {
        q1!!.add(x)
        var sz = q1!!.size
        while (sz > 1) {
            q1!!.add(q1!!.remove())
            sz--
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        return q1!!.remove()!!;
    }

    /** Get the top element. */
    fun top(): Int {
        return q1!!.peek()!!;
    }

    /** Returns whether the stack is empty. */
    fun empty(): Boolean {
        return q1!!.isEmpty();
    }

}