package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    459. Repeated Substring Pattern

    https://leetcode.com/problems/repeated-substring-pattern/

 */

fun repeatedSubstringPatternOne(s: String): Boolean {
    val sLen = s.length
    for (i in 0 until sLen / 2) {
        val substring = s.substring(0, i + 1)
        if (sLen % substring.length == 0) {
            var repetitions = sLen / substring.length
            val builder = StringBuilder()
            while (repetitions > 0) {
                builder.append(substring)
                repetitions--
            }

            if (builder.toString() == s) return true
        }
    }
    return false
}

fun repeatedSubstringPattern(s: String): Boolean {
    var str = s.plus(s)
    str = str.drop(1)
    str = str.dropLast(1)
    return str.contains(s)
}


fun main() {
    repeatedSubstringPattern("abab").printAndNewLine()
    repeatedSubstringPattern("aba").printAndNewLine()
    repeatedSubstringPattern("abcabcabcabc").printAndNewLine()
}