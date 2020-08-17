package com.harsh.sharma.leetcode.easy

/*

    69. Sqrt(x)

    https://leetcode.com/problems/sqrtx/

 */


// Calculate Sqrt manually https://www.wikihow.com/Calculate-a-Square-Root-by-Hand

// Fastest solution available
fun mySqrt(x: Int): Int {
    if (x == 0 || x == 1) {
        return x
    }
    var l = 0
    var h = x
    var m = 0
    var s = 0
    while (l <= h) {
        m = l + (h - l) / 2
        s = x / m
        if (s == m) {
            return m
        } else if (s < m) {
            h = m - 1
        } else {
            l = m + 1
        }
    }
    return h
}

fun main() {
    println(mySqrt(32765))
    println(mySqrt(400))
    println(mySqrt(625))
    println(mySqrt(159357))
}



