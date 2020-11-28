package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine
import java.util.*

/*

    290. Word Pattern

    https://leetcode.com/problems/word-pattern/

 */

fun wordPatternTwoHashMaps(pattern: String, s: String): Boolean {
    val mapChar: HashMap<Char?, String?> = HashMap()
    val mapWord: HashMap<String?, Char?> = HashMap()
    val words = s.split(" ".toRegex()).toTypedArray()
    if (words.size != pattern.length) return false
    for (i in words.indices) {
        val c = pattern[i]
        val w = words[i]
        if (!mapChar.containsKey(c)) {
            if (mapWord.containsKey(w)) {
                return false
            } else {
                mapChar[c] = w
                mapWord[w] = c
            }
        } else {
            val mappedWord = mapChar[c]
            if (mappedWord != w) return false
        }
    }
    return true
}

fun main() {
    wordPatternTwoHashMaps("abba", "dog cat cat dog").printAndNewLine()
    wordPatternTwoHashMaps("abba", "dog cat cat fish").printAndNewLine()
    wordPatternTwoHashMaps("aaaa", "dog cat cat dog").printAndNewLine()
    wordPatternTwoHashMaps("abba", "dog dog dog dog").printAndNewLine()
}