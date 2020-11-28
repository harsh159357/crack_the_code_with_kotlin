package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    461. Hamming Distance

    https://leetcode.com/problems/hamming-distance/

 */

fun hammingDistance(x: Int, y: Int): Int {
    var reminder = x xor y
    var distance = 0
    do {
        if (reminder % 2 == 1) {
            distance++
        }
        reminder /= 2
    } while (reminder > 0)
    return distance
}

fun main() {
    hammingDistance(1, 4).printAndNewLine()
}