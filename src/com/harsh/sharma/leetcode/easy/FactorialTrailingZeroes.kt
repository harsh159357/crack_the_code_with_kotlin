package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    172. Factorial Trailing Zeroes

    https://leetcode.com/problems/factorial-trailing-zeroes/

 */

fun trailingZeroesRecursive(n: Int): Int {
    return if (n > 0) trailingZeroesRecursive(n / 5) + n / 5 else 0
}

fun trailingZeroesOne(n: Int): Int {
    var result = 0
    var currentMultiple = 5L

    while (n >= currentMultiple) {
        result += (n / currentMultiple).toInt()
        currentMultiple *= 5
    }

    return result
}

fun trailingZeroesBest(n: Int): Int {
    var tempNumber = n
    var count = 0
    while (tempNumber > 4)
        count += 5.let {
            tempNumber /= it; tempNumber
        }
    return count
}

fun main() {
    trailingZeroesBest(3).printAndNewLine()
    trailingZeroesBest(5).printAndNewLine()
    trailingZeroesBest(10).printAndNewLine()
    trailingZeroesBest(20).printAndNewLine()
    trailingZeroesBest(30).printAndNewLine()
    trailingZeroesBest(2331).printAndNewLine()
    trailingZeroesBest(2371).printAndNewLine()
    trailingZeroesBest(1808548329).printAndNewLine()
}