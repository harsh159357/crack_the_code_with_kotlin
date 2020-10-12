package com.harsh.sharma.leetcode.easy

/*

    344. Reverse String

    https://leetcode.com/problems/reverse-string/

 */

fun recursionInPlace(s: CharArray, left: Int, right: Int) {
    var left = left
    var right = right
    if (left >= right) return
    val tmp = s[left]
    s[left++] = s[right]
    s[right--] = tmp
    recursionInPlace(s, left, right)
}

fun reverseString(s: CharArray) {
    recursionInPlace(s, 0, s.size - 1)
}

fun reverseStringTwoPointers(s: CharArray) {
    var left = 0
    var right = s.size - 1
    while (left < right) {
        val tmp = s[left]
        s[left++] = s[right]
        s[right--] = tmp
    }
}
