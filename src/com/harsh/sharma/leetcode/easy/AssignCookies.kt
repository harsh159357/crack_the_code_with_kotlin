package com.harsh.sharma.leetcode.easy

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
    println(findContentChildren(intArrayOf(1,2,3), intArrayOf(1,1)))
    println(findContentChildren(intArrayOf(1,2), intArrayOf(1,2,3)))
}