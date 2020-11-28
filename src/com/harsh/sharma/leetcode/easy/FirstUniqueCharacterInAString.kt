package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine
import java.util.*


/*

    387. First Unique Character in a String

    https://leetcode.com/problems/first-unique-character-in-a-string/

 */

fun firstUniqChar(s: String): Int {
    val count = HashMap<Char, Int>()
    val n = s.length
    // build hash map : character and how often it appears
    for (i in 0 until n) {
        val c = s[i]
        count[c] = count.getOrDefault(c, 0) + 1
    }

    // find the index
    for (i in 0 until n) {
        if (count[s[i]] == 1) return i
    }
    return -1
}

fun main() {
    firstUniqChar("leetcode").printAndNewLine()
    firstUniqChar("loveleetcode").printAndNewLine()
}