package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    367. Valid Perfect Square

    https://leetcode.com/problems/valid-perfect-square/

 */

fun isPerfectSquareOne(num: Int): Boolean {
    if (num == 1) return true

    var left = 1.toBigInteger()
    var right = num.toBigInteger()
    val bigNum = num.toBigInteger()

    while (right - left > 1.toBigInteger()) {
        val current = (right + left) / 2.toBigInteger()
        val sq = current * current

        if (sq == bigNum) return true
        if (sq < bigNum) left = current
        if (sq > bigNum) right = current
    }

    return false
}


fun isPerfectSquareTwo(num: Int): Boolean {
    if (num == 1) return true
    var low = 0
    var high = num
    var mid = 0
    for (i in 0..10000) {
        mid = (high - low) / 2 + low
        if (mid == 0) return false
        val square = mid * mid
        when {
            willOverflow(mid.toLong()) -> high = mid
            square == num -> return true
            square > num -> high = mid
            else -> low = mid
        }
    }
    return false
}

fun willOverflow(x: Long): Boolean =
    x * x > Int.MAX_VALUE

fun main() {
    isPerfectSquareOne(16).printAndNewLine()
    isPerfectSquareOne(14).printAndNewLine()
    isPerfectSquareOne(25).printAndNewLine()
}