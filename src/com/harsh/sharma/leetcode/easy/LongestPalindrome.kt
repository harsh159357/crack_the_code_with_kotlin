package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    409. Longest Palindrome

    https://leetcode.com/problems/longest-palindrome/

 */

fun longestPalindrome(s: String): Int {
    val count = IntArray(128)
    for (c in s.toCharArray()) count[c.toInt()]++
    var ans = 0
    for (v in count) {
        ans += v / 2 * 2
        if (ans % 2 == 0 && v % 2 == 1) ans++
    }
    return ans
}

fun main() {
    longestPalindrome("abccccdd").printAndNewLine()
    longestPalindrome("a").printAndNewLine()
    longestPalindrome("b").printAndNewLine()
}