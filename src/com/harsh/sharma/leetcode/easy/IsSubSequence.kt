package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    392. Is Subsequence

    https://leetcode.com/problems/is-subsequence/

 */

fun isSubsequence(s: String, t: String): Boolean {
    var index1 = 0
    var index2 = 0

    while (index1 < s.length && index2 < t.length) {
        if (s[index1] == t[index2]) index1++
        index2++
    }
    return index1 == s.length
}

fun main() {
    isSubsequence("abc", "ahbgdc").printAndNewLine()
    isSubsequence("axc", "ahbgdc").printAndNewLine()
}