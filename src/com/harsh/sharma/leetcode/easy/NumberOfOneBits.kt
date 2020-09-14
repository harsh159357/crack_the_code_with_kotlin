package com.harsh.sharma.leetcode.easy

/*

    191. Number of 1 Bits

    https://leetcode.com/problems/number-of-1-bits/

 */

fun hammingWeightLoopAndFlip(n: Int): Int {
    var bits = 0
    var mask = 1
    for (i in 0..31) {
        if (n and mask != 0) {
            bits++
        }
        mask = mask shl 1
    }
    return bits
}

fun hammingWeightBitManipulation(n: Int): Int {
    var n = n
    var sum = 0
    while (n != 0) {
        sum++
        n = n and n - 1
    }
    return sum
}