package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    521. Longest Uncommon Subsequence I

    https://leetcode.com/problems/longest-uncommon-subsequence-i/

 */

fun findLUSlength(a: String, b: String): Int {
    return if (a == b) -1 else a.length.let { if (it > b.length) it else b.length }
}

fun main() {
    findLUSlength("aba", "cdc").printAndNewLine()
    findLUSlength("aaa", "bbb").printAndNewLine()
    findLUSlength("aaa", "aaa").printAndNewLine()
}