package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    557. Reverse Words in a String III

    https://leetcode.com/problems/reverse-words-in-a-string-iii/

 */

fun reverseWords(s: String): String {
    val array = s.toCharArray()
    var s = 0
    var e = 0
    fun reverse(l: Int, r: Int) {
        var l = l
        var r = r
        while (l < r && r < array.size) {
            array[l] = array[r].also { array[r] = array[l] }
            l++.also { r-- }
        }
    }


    while (e < array.size) {
        if (array[e] == ' ') {
            reverse(s, e - 1)
            s = e + 1
        }
        e++
    }
    reverse(s, e - 1)
    return String(array)
}

fun main() {
    reverseWords("Let's take LeetCode contest").printAndNewLine()
}