package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    389. Find the Difference

    https://leetcode.com/problems/find-the-difference/

 */

fun findTheDifference(s: String, t: String): Char {
    val sMap = s.toCharArray().toList().groupingBy { it }.eachCount()
    return t.toCharArray().toList().groupingBy { it }.eachCount()
        .filter { element -> sMap[element.key] != element.value }
        .map { (key, _) -> key }[0]
}

fun main() {
    findTheDifference("abcd", "abcde").printAndNewLine()
    findTheDifference("", "y").printAndNewLine()
    findTheDifference("a", "aa").printAndNewLine()
    findTheDifference("aea", "ae").printAndNewLine()
}