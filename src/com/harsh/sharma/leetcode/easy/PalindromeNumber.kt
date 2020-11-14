package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    9. Palindrome Number

    https://leetcode.com/problems/palindrome-number/

 */


// This attempt is not valid as problem requirements are not to convert it to string
fun isPalindrome(x: Int): Boolean {
    if (x < 0) {
        return false
    }
    val number = x.toString()
    var reverse = ""
    for (i in (number.length - 1) downTo 0) {
        reverse += number[i]
    }
    return reverse == number
}

fun isPalindrome2(x: Int): Boolean {
    if (x < 0) {
        return false
    }

    var reverse = 0
    var temp = x

    while (temp != 0) {
        var remainder = temp % 10
        temp /= 10
        reverse = (reverse * 10) + remainder
    }

    return reverse == x
}

fun isPalindrome3(x: Int): Boolean {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false
    }

    var revertedNumber = 0
    var temp = x
    while (temp > revertedNumber) {
        revertedNumber = revertedNumber * 10 + temp % 10
        temp /= 10
    }

    return (temp == revertedNumber || temp == revertedNumber / 10)
}

fun main() {
    isPalindrome(-121).printAndNewLine()
    isPalindrome2(-121).printAndNewLine()
    isPalindrome3(-121).printAndNewLine()
}

    