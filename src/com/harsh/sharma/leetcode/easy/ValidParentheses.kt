package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine
import java.util.*

/*

    20. Valid Parentheses

    https://leetcode.com/problems/valid-parentheses/

 */

fun isValid(s: String): Boolean {

    val mappings: MutableMap<Char, Char> = mutableMapOf(
        ')' to '(',
        '}' to '{',
        ']' to '['
    )

    val stack = Stack<Char>()
    for (i in s.indices) {
        val c = s[i]
        if (mappings.containsKey(c)) {
            val topElement = if (stack.empty()) '#' else stack.pop()
            if (topElement != mappings[c]) {
                return false
            }
        } else {
            stack.push(c)
        }
    }
    return stack.isEmpty()
}

fun main() {
    (if (isValid("()")) "Valid" else "Not Valid").printAndNewLine()

    (if (isValid("()[]{}")) "Valid" else "Not Valid").printAndNewLine()

    (if (isValid("(]")) "Valid" else "Not Valid").printAndNewLine()

    (if (isValid("([)]")) "Valid" else "Not Valid").printAndNewLine()

    (if (isValid("{[]}")) "Valid" else "Not Valid").printAndNewLine()
}
