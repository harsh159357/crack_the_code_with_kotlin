package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    205. Isomorphic Strings

    https://leetcode.com/problems/isomorphic-strings/

 */

fun isIsomorphicOne(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val match = HashMap<Char, Char>()
    (s.indices).forEach {
        if (match.containsKey(s[it])) {
            if ((match[s[it]] != t[it])) return false
        } else {
            if (!match.containsValue(t[it])) match[s[it]] = t[it]
            else return false
        }
    }
    return true
}

fun isIsomorphicTwo(s: String, t: String): Boolean {
    val m1 = IntArray(256) { -1 }
    val m2 = IntArray(256) { -1 }
    (s.indices).forEach {
        if (m1[s[it].toInt()] != m2[t[it].toInt()]) return false
        m1[s[it].toInt()] = it
        m2[t[it].toInt()] = it
    }
    return true
}

fun main() {
    isIsomorphicOne("egg", "add").printAndNewLine()
    isIsomorphicOne("foo", "bar").printAndNewLine()
    isIsomorphicOne("paper", "title").printAndNewLine()
    isIsomorphicOne("ab", "aa").printAndNewLine()
}