package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    455. Assign Cookies

    https://leetcode.com/problems/assign-cookies/

 */

fun findContentChildren(g: IntArray, s: IntArray): Int {
    g.sortDescending()
    s.sortDescending()
    var ans = 0
    var index = 0
    for (i in 0 until g.size) {
        if (index > s.lastIndex) {
            return ans
        }
        if (s[index] >= g[i]) {
            index++
            ans++
        }
    }
    return ans
}

fun main() {
    findContentChildren(intArrayOf(1, 2, 3), intArrayOf(1, 1)).printAndNewLine()
    findContentChildren(intArrayOf(1, 2), intArrayOf(1, 2, 3)).printAndNewLine()
}