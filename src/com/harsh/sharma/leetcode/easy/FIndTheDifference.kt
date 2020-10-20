package com.harsh.sharma.leetcode.easy

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
    println(findTheDifference("abcd","abcde"))
    println(findTheDifference("","y"))
    println(findTheDifference("a","aa"))
    println(findTheDifference("aea","ae"))
}