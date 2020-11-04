package com.harsh.sharma.leetcode.easy

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
    println(hammingDistance(1,4))
}