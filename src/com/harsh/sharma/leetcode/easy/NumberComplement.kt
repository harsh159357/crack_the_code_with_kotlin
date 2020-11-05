package com.harsh.sharma.leetcode.easy

import kotlin.math.floor
import kotlin.math.log2
import kotlin.math.pow

/*

    476. Number Complement

    https://leetcode.com/problems/number-complement/

 */

fun findComplementOne(num: Int): Int {
    val basePower: Double = floor(log2(num.toDouble()))
    val baseNumber: Long = 2.0.pow(basePower + 1.0).toLong() - 1
    val ans = num.toLong() xor baseNumber
    return ans.toInt()
}

fun findComplementTwo(num: Int): Int {
    val leadingZeroes = Integer.numberOfLeadingZeros(num)
    return num.inv().shl(leadingZeroes).shr(leadingZeroes)
}

fun main() {666666666666
    println(findComplementTwo(5))
    println(findComplementTwo(1))
}

