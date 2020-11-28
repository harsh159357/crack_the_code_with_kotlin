package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine
import kotlin.math.pow
import kotlin.math.sqrt

/*

    70. Climbing Stairs

    https://leetcode.com/problems/climbing-stairs/

 */

//Brute Force and Recursion
fun climbStairsBruteForce(n: Int): Int {
    return climbStairsBruteForce(0, n)
}

fun climbStairsBruteForce(i: Int, n: Int): Int {
    if (i > n) {
        return 0
    }
    return if (i == n) {
        1
    } else climbStairsBruteForce(i + 1, n) + climbStairsBruteForce(i + 2, n)
}


//Recursion with Memoization
fun climbStairsMemoIzation(n: Int): Int {
    val memo = IntArray(n + 1)
    return climbStairsMemoIzation(0, n, memo)
}

fun climbStairsMemoIzation(i: Int, n: Int, memo: IntArray): Int {
    if (i > n) {
        return 0
    }
    if (i == n) {
        return 1
    }
    if (memo[i] > 0) {
        return memo[i]
    }
    memo[i] = climbStairsMemoIzation(i + 1, n, memo) + climbStairsMemoIzation(i + 2, n, memo)
    return memo[i]
}

//Dynamic Programming
fun climbStairsDp(n: Int): Int {
    if (n == 1) {
        return 1
    }
    val dp = IntArray(n + 1)
    dp[1] = 1
    dp[2] = 2
    for (i in 3..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }
    return dp[n]
}

//Fibonacci Number
fun climbStairsFn(n: Int): Int {
    if (n == 1) {
        return 1
    }
    var first = 1
    var second = 2
    for (i in 3..n) {
        val third = first + second
        first = second
        second = third
    }
    return second
}

// One Liner
fun climbStairs(n: Int) = sqrt(5.0).let { Math.round(((1.0 + it) / 2.0).pow(n + 1.0) / it).toInt() }

fun main() {
    climbStairsMemoIzation(45).printAndNewLine()
    climbStairsMemoIzation(30).printAndNewLine()
    climbStairsMemoIzation(15).printAndNewLine()
    climbStairsMemoIzation(10).printAndNewLine()
    climbStairsMemoIzation(5).printAndNewLine()
}