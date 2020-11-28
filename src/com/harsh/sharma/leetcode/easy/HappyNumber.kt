package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    202. Happy Number

    https://leetcode.com/problems/happy-number/

 */


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private val memo = HashSet<Int>()
fun isHappyOne(n: Int): Boolean {
    var num = n
    while (!memo.contains(num)) {
        memo.add(num)
        var sum = 0
        while (num != 0) {
            sum += (num % 10) * (num % 10)
            num /= 10
        }
        num = sum
    }
    if (num == 1) return true
    return false
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
fun isHappyTwo(n: Int): Boolean {
    var one = n
    var two = n
    while (n != 1) {
        one = squareSum(one)
        two = squareSum(squareSum(two))
        if (one == 1 || two == 1) return true
        if (one == two) return false
    }
    return true
}

private fun squareSum(n: Int): Int {
    var sum = 0
    var num = n
    while (num != 0) {
        val mod = num % 10
        sum += mod * mod
        num /= 10
    }
    return sum
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
fun isHappy(n: Int): Boolean {
    var num = n
    while (num >= 10) {
        var sum = 0
        while (num != 0) {
            sum += (num % 10) * (num % 10)
            num /= 10
        }
        num = sum
    }
    return num == 1 || num == 7
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

fun main() {
    isHappy(34).printAndNewLine()
    isHappy(7).printAndNewLine()
    isHappy(8).printAndNewLine()
    isHappy(82).printAndNewLine()
    isHappy(68).printAndNewLine()
    isHappy(100).printAndNewLine()
    isHappy(1).printAndNewLine()
    isHappy(10000000).printAndNewLine()
    isHappy(0x6ffffff).printAndNewLine()
    isHappy(128319).printAndNewLine()
}