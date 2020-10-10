package com.harsh.sharma.leetcode.easy

import kotlin.math.log10

/*

    326. Power of Three

    https://leetcode.com/problems/power-of-three/

 */

fun isPowerOfThreeLooping(n: Int): Boolean {
    var n = n
    if (n < 1) {
        return false
    }
    while (n % 3 == 0) {
        n /= 3
    }
    return n == 1
}

fun isPowerOfThreeMathematics(n: Int): Boolean {
    return log10(n.toDouble()) / log10(3.0) % 1 == 0.0
}

fun isPowerOfThree(n: Int): Boolean {
    return n > 0 && 1162261467 % n == 0
}

fun main() {
    println(isPowerOfThree(27))
    println(isPowerOfThree(0))
    println(isPowerOfThree(9))
    println(isPowerOfThree(45))
}