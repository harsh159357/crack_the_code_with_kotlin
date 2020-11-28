package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    504. Base 7

    https://leetcode.com/problems/base-7/

 */


fun convertToBase7(num: Int): String {
    if (num == 0) {
        return "0"
    }
    val flag = if (num >= 0) 1 else -1
    var p = Math.abs(num)
    val ret = StringBuilder()
    while (p > 0) {
        ret.append(p.rem(7))
        p /= 7
    }
    if (flag == -1) {
        ret.append("-")
    }
    return ret.reverse().toString()
}

fun main() {
    convertToBase7(100).printAndNewLine()
    convertToBase7(-7).printAndNewLine()
}
