package com.harsh.sharma.leetcode.easy

/*

    342. Power of Four

    https://leetcode.com/problems/power-of-four/

 */

fun isPowerOfFourOne(num: Int): Boolean {
    var current = num
    if (current < 1) {
        return false
    }
    while (current % 4 == 0) {
        current /= 4
    }
    return current == 1
}

fun isPowerOfFourTwo(num: Int): Boolean {
    var curr = num

    while (curr != 0) {
        if (curr == 1) return true
        if (curr and 3 != 0) return false
        curr = curr ushr 2
    }

    return false
}

fun main() {
    println(isPowerOfFourTwo(16))
    println(isPowerOfFourTwo(5))
}