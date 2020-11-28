package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine
import java.util.*

/*

    541. Reverse String II

    https://leetcode.com/problems/reverse-string-ii/

 */

fun reverseStr(s: String, k: Int): String {
    var index = 0
    val result = StringBuilder()
    val stack = Stack<Char>()
    s.forEach {
        when {
            index == k * 2 - 1 -> {
                index = 0
                result.append(it)
            }
            index > k - 1 -> {
                result.append(it)
                index++
            }
            index == k - 1 -> {
                index++
                stack.push(it)
                while (stack.isNotEmpty()) {
                    result.append(stack.pop())
                }
            }
            else -> {
                stack.push(it)
                index++
            }
        }
    }

    while (stack.isNotEmpty()) {
        result.append(stack.pop())
    }

    return result.toString()
}

fun main() {
    reverseStr("abcdefg",2).printAndNewLine()
}