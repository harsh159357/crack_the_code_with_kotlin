package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    507. Perfect Number

    https://leetcode.com/problems/perfect-number/

 */

fun checkPerfectNumber(num: Int): Boolean {
    if (num == 0 || num == 1) {
        return false
    }
    var sum = 0
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            sum += i
            if (num / i != i) {
                sum += num / i
            }
        }
    }
    return sum + 1 == num
}

fun main() {
    checkPerfectNumber(28).printAndNewLine()
    checkPerfectNumber(6).printAndNewLine()
    checkPerfectNumber(496).printAndNewLine()
    checkPerfectNumber(2).printAndNewLine()
}