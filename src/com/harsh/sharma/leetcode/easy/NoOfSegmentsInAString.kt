package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    434. Number of Segments in a String

    https://leetcode.com/problems/number-of-segments-in-a-string/

 */

fun countSegmentsUsingBuiltIns(s: String): Int {
    val trimmed = s.trim { it <= ' ' }
    return if (trimmed == "") {
        0
    } else trimmed.split("\\s+".toRegex()).toTypedArray().size
}

fun countSegmentsInPlace(s: String): Int {
    var segmentCount = 0
    for (i in s.indices) {
        if ((i == 0 || s[i - 1] == ' ') && s[i] != ' ') {
            segmentCount++
        }
    }
    return segmentCount
}

fun main() {
    countSegmentsInPlace("Hello, my name is John").printAndNewLine()
    countSegmentsInPlace("Hello").printAndNewLine()
    countSegmentsInPlace("love live! mu'sic forever").printAndNewLine()
    countSegmentsInPlace("").printAndNewLine()
}