package com.harsh.sharma.leetcode.easy

/*

    168. Excel Sheet Column Title

    https://leetcode.com/problems/excel-sheet-column-title/

 */

fun convertToTitle(n: Int): String {
    val sb = StringBuilder()
    var b = n % 26
    var a = (n - b) / 26

    while (true) {
        if (a == 0 && b == 0) {
            break
        }
        if (b > 0) {
            sb.insert(0, 'A' + b - 1)
        } else {
            a--
            sb.insert(0, 'Z')
        }

        b = a % 26
        a = (a - b) / 26
    }
    return sb.toString()
}

fun main() {
    println(convertToTitle(1)) // "A"
    println(convertToTitle(2)) // "B"
    println(convertToTitle(3)) // "C"
    println(convertToTitle(26)) // "Z"
    println(convertToTitle(27)) // "AA"
    println(convertToTitle(28)) // "AB"
    println(convertToTitle(701)) // "ZY"
}