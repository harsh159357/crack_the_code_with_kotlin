package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

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
    convertToTitle(1).printAndNewLine() // "A"
    convertToTitle(2).printAndNewLine() // "B"
    convertToTitle(3).printAndNewLine() // "C"
    convertToTitle(26).printAndNewLine() // "Z"
    convertToTitle(27).printAndNewLine() // "AA"
    convertToTitle(28).printAndNewLine() // "AB"
    convertToTitle(701).printAndNewLine() // "ZY"
}