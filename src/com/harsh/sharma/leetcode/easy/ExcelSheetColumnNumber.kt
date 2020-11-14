package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine
import kotlin.math.pow

/*

    171. Excel Sheet Column Number

    https://leetcode.com/problems/excel-sheet-column-number/

 */

fun titleToNumberOne(s: String): Int {
    var count = 0
    for (i in s.length - 1 downTo 0) {
        val j = s.length - 1 - i
        count += (s[i] - '@') * 26.0.pow(j.toDouble()).toInt()
    }
    return count
}

private fun titleToNumberTwo(s: String): Int {
    var value = 0
    for (c in s) {
        value = (value * 26) + (c - 'A' + 1)
    }
    return value
}

fun main() {
    titleToNumberOne("A").printAndNewLine()      //1
    titleToNumberOne("AB").printAndNewLine()     //28
    titleToNumberOne("ZY").printAndNewLine()     //701
    titleToNumberOne("AAA").printAndNewLine()    //703
}