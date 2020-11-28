package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine
import kotlin.math.log10

/*

    231. Power of Two

    https://leetcode.com/problems/power-of-two/

 */

fun isPowerOfTwo1(n: Int): Boolean {
    if (n == 0) return false
    val res = log10(n.toDouble()) / log10(2.0)
    return (res - res.toInt()) < 1e-10
}

fun isPowerOfTwo2(n: Int): Boolean {
    return n > 0 && (1073741824 % n == 0)
}

fun isPowerOfTwo3(n: Int): Boolean {
    return n > 0 && (n and n - 1 == 0)
}

fun main() {
    isPowerOfTwo3(2).printAndNewLine()
    isPowerOfTwo3(4).printAndNewLine()
    isPowerOfTwo3(6).printAndNewLine()
    isPowerOfTwo3(8).printAndNewLine()
    isPowerOfTwo3(10).printAndNewLine()
    isPowerOfTwo3(12).printAndNewLine()
    isPowerOfTwo3(14).printAndNewLine()
    isPowerOfTwo3(16).printAndNewLine()
    isPowerOfTwo3(18).printAndNewLine()
    isPowerOfTwo3(20).printAndNewLine()
}