package com.harsh.sharma.leetcode.easy

import java.util.*


/*

    232. Implement Queue using Stacks

    https://leetcode.com/problems/implement-queue-using-stacks/

 */

class MyQueue() {

    /** Initialize your data structure here. */
    private var front: Int = 0
    private var s1 = Stack<Int>()
    private val s2 = Stack<Int>()

    // Push element x to the back of queue.
    fun push(x: Int) {
        if (s1.empty()) front = x
        s1.push(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        return s2.pop();
    }

    /** Get the front element. */
    fun peek(): Int {
        if (!s2.isEmpty()) {
            return s2.peek();
        }
        return front;
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        return s1.isEmpty() && s2.isEmpty();
    }

}