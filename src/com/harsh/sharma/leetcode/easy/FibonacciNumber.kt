package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    509. Fibonacci Number

    https://leetcode.com/problems/fibonacci-number/

 */

fun fib(N: Int): Int {
    if (N <= 1) return N
    var a = 0
    var b = 1
    for (i in 2..N) {
        val sum = a + b
        a = b
        b = sum
    }
    return b
}

fun main() {
    fib(2).printAndNewLine()
    fib(3).printAndNewLine()
    fib(4).printAndNewLine()
}