package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    204. Count Primes

    https://leetcode.com/problems/count-primes/

 */

fun countPrimes(n: Int): Int {
    var count = 0
    var p = 2
    val sieve = BooleanArray(n)

    for (i in 2 until sieve.size) {
        sieve[i] = true
    }

    while (p * p < n) {
        if (sieve[p]) {
            for (j in p * p until sieve.size step p) {
                sieve[j] = false
            }
        }
        p++
    }

    for (element in sieve) {
        if (element) count++
    }
    return count
}

fun main() {
    countPrimes(10).printAndNewLine()
    countPrimes(1).printAndNewLine()
    countPrimes(2).printAndNewLine()
    countPrimes(1000000).printAndNewLine()
}
