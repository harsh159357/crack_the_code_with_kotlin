package com.harsh.sharma.leetcode.easy

/*

    441. Arranging Coins

    https://leetcode.com/problems/arranging-coins/solution/

 */

fun arrangeCoinsOne(n: Int): Int {
    var left: Long = 0
    var right = n.toLong()
    var k: Long
    var curr: Long
    while (left <= right) {
        k = left + (right - left) / 2
        curr = k * (k + 1) / 2
        if (curr == n.toLong()) return k.toInt()
        if (n < curr) {
            right = k - 1
        } else {
            left = k + 1
        }
    }
    return right.toInt()
}

fun arrangeCoinsTwo(n: Int): Int {
    return (Math.sqrt(2 * n.toLong() + 0.25) - 0.5).toInt()
}

fun main() {
    println(arrangeCoinsOne(5))
    println(arrangeCoinsTwo(8))
}