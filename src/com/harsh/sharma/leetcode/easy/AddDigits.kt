package com.harsh.sharma.leetcode.easy

/*

    258. Add Digits

    https://leetcode.com/problems/add-digits/

 */

fun addDigitsOne(num: Int): Int {
    var num = num
    var digitalRoot = 0
    while (num > 0) {
        digitalRoot += num % 10
        num /= 10
        if (num == 0 && digitalRoot > 9) {
            num = digitalRoot
            digitalRoot = 0
        }
    }
    return digitalRoot
}

fun addDigitsTwo(num: Int): Int {
    if (num == 0) return 0
    return if (num % 9 == 0) 9 else num % 9
}

fun addDigitsThree(num: Int): Int {
    return if (num == 0) 0 else 1 + (num - 1) % 9
}