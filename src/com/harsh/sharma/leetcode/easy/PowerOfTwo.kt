package com.harsh.sharma.leetcode.easy

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
    return n > 0 && (n and n-1 == 0)
}

fun main() {
    println(isPowerOfTwo3(2))
    println(isPowerOfTwo3(4))
    println(isPowerOfTwo3(6))
    println(isPowerOfTwo3(8))
    println(isPowerOfTwo3(10))
    println(isPowerOfTwo3(12))
    println(isPowerOfTwo3(14))
    println(isPowerOfTwo3(16))
    println(isPowerOfTwo3(18))
    println(isPowerOfTwo3(20))
}