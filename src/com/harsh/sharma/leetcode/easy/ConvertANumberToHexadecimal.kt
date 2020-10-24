package com.harsh.sharma.leetcode.easy

/*

    405. Convert a Number to Hexadecimal

    https://leetcode.com/problems/convert-a-number-to-hexadecimal/

 */

fun toHexOne(num: Int): String {
    if (num == 0) return "0"
    val map = charArrayOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f')
    val result = StringBuilder()
    var tmp = num
    while (tmp != 0) {
        result.append(map[tmp and 0xf])
        tmp = tmp ushr 4
    }
    return result.reversed().toString()
}


fun toHexTwo(num: Int): String {
    return (0..7)
        .takeWhile { if ((num) >= 0) num >= it shl 4 else num <= it shl 4}
        .map { "0123456789abcdef"[(num ushr (it * 4)) and 0xf].toString() }
        .reduce { acc, s -> acc + s }
        .substringBeforeLast("0")
        .reversed()
}