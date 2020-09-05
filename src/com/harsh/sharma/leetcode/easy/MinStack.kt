package com.harsh.sharma.leetcode.easy

import java.util.*


/*

    155. Min Stack

    https://leetcode.com/problems/min-stack/

 */

internal class MinStackOne {
    private val data: Stack<Int> = Stack()
    private val min: Stack<Int> = Stack()

    fun push(x: Int) {
        data.push(x)
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x)
        }
    }

    fun pop() {
        if (!data.isEmpty()) {
            if (min.peek().toInt() == data.pop().toInt()) {
                min.pop()
            }
        }
    }

    fun top(): Int {
        return if (data.isEmpty()) {
            -1
        } else data.peek()
    }

    fun getMin(): Int {
        return if (min.isEmpty()) {
            -1
        } else min.peek()
    }

}

internal class MinStackTwo {
    private var head: Node? = null
    fun push(x: Int) {
        head = if (head == null) {
            Node(x, x, null)
        } else {
            Node(x, Math.min(x, head!!.min), head)
        }
    }

    fun pop() {
        head = head!!.next
    }

    fun top(): Int {
        return head!!.`val`
    }

    fun getMin(): Int {
        return head!!.min
    }

    private class Node(var `val`: Int, var min: Int, var next: Node?)
}

internal class MinStackThree {
    private var data: IntArray
    private var min: IntArray
    private var head = 0
    private var cap = 1024
    fun push(x: Int) {
        if (head == cap - 2) {
            cap += (cap shr 1)
            data = data.copyOf(cap)
            min = min.copyOf(cap)
        }
        data[++head] = x
        min[head] = if (head == 1) x else Math.min(min[head - 1], x)
    }

    fun pop() {
        if (head > 0) {
            head--
        }
    }

    fun top(): Int {
        return if (head > 0) data[head] else -1
    }

    fun getMin(): Int {
        return if (head > 0) min[head] else -1
    }

    init {
        data = IntArray(cap)
        min = IntArray(cap)
        min[0] = Int.MAX_VALUE
    }
}

fun main() {
    var minStack = MinStackOne()
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin(); // return -3
    minStack.pop();
    minStack.top();    // return 0
    minStack.getMin(); // return -2
}