package com.harsh.sharma.leetcode.easy

/*

    58. Length of Last Word

    https://leetcode.com/problems/length-of-last-word/

 */

fun lengthOfLastWordOneLiner(s: String): Int {
    return s.trim().length - s.trim().lastIndexOf(" ") - 1;
}

fun lengthOfLastWordNotOptimized(s: String): Int {
    val split = s.trim().split(" ")

    return when (split.size) {
        0 -> 0
        else -> split.last().length
    }
}

fun lengthOfLastWord(s: String): Int {
    var count = 0
    val ch = s.toCharArray()
    var index = s.length - 1
    for (i in s.length - 1 downTo 0) {
        if (ch[i] == ' ' && index == i) {
            index--
        } else if (ch[i] != ' ') {
            count++
        } else break
    }
    return count
}

fun main() {
    println(lengthOfLastWord(""))
    println(lengthOfLastWord(" "))

    println(lengthOfLastWord("a "))
    println(lengthOfLastWord("a"))
    println(lengthOfLastWord(" a"))
    println(lengthOfLastWord(" a "))
    println(lengthOfLastWord("   a  "))

    println(lengthOfLastWord(" Hello World"))
    println(lengthOfLastWord("  Hello World  "))
    println(lengthOfLastWord(" Hello World "))
    println(lengthOfLastWord("  Hello    World   Kotlin  "))
    println(lengthOfLastWord("       HelloWorld"))

    println(lengthOfLastWord("Today is a nice day"))
}