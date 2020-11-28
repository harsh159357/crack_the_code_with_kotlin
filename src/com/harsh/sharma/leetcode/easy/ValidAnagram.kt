package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine
import java.util.*


/*

    242. Valid Anagram

    https://leetcode.com/problems/valid-anagram/

 */

fun isAnagramUsingSorting(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    val str1 = s.toCharArray()
    val str2 = t.toCharArray()
    Arrays.sort(str1)
    Arrays.sort(str2)
    return Arrays.equals(str1, str2)
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    val table = IntArray(26)
    for (element in s) {
        table[element - 'a']++
    }
    for (i in t.indices) {
        table[t[i] - 'a']--
        if (table[t[i] - 'a'] < 0) {
            return false
        }
    }
    return true
}

fun main() {
    isAnagram("anagram", "nagaram").printAndNewLine()
    isAnagram("rat", "car").printAndNewLine()
}