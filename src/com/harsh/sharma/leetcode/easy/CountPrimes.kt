package com.harsh.sharma.leetcode.easy

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
    println(countPrimes(10))
    println(countPrimes(1))
    println(countPrimes(2))
    println(countPrimes(1000000))
}
