package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    263. Ugly Number

    https://leetcode.com/problems/ugly-number/

 */

fun isUglyOne(num: Int): Boolean {
    var num = num
    if (num == 1) {
        return true
    }
    if (num < 1) {
        return false
    }
    while (num > 1) {
        if (num % 5 == 0) {
            num /= 5
        } else if (num % 3 == 0) {
            num /= 3
        } else if (num % 2 == 0) {
            num /= 2
        } else {
            return false
        }
    }
    return true
}


fun isUglyTwo(num: Int): Boolean {
    if (num == 0) {
        return false
    }
    var num = num
    intArrayOf(2, 3, 5).forEach {
        while (num % it == 0) {
            num /= it
        }
    }
    return num == 1
}


fun main() {
    isUglyOne(6).printAndNewLine()
    isUglyOne(8).printAndNewLine()
    isUglyOne(14).printAndNewLine()
}