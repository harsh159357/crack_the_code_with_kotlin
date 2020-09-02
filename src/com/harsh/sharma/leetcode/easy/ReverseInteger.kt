package com.harsh.sharma.leetcode.easy
/*

    7. Reverse Integer

    https://leetcode.com/problems/reverse-integer/

 */


fun reverse(x: Int): Int {
    var result = 0
    var temp = x
    while (temp != 0) {
        var remainder = temp % 10
        temp /= 10
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && remainder > 7)) return 0
        if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && remainder < -8)) return 0
        result = result * 10 + remainder
    }
    return result;
}


fun Int.reverseItKotlinWay(): Int {
    var result = 0
    var temp = this
    while (temp != 0) {
        var remainder = temp % 10
        temp /= 10
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && remainder > 7)) return 0
        if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && remainder < -8)) return 0
        result = result * 10 + remainder
    }
    return result;
}

fun reverseUsingLong(x: Int): Int {
    var x = x
    var res: Long = 0
    while (x != 0) {
        res = res * 10 + x % 10
        x = x / 10
    }
    return if (res < Int.MIN_VALUE || res > Int.MAX_VALUE) {
        0
    } else {
        res.toInt()
    }
}
fun main() {
    println((reverse(-555)))

    println(123.reverseItKotlinWay())

    println(reverseUsingLong(-123))
}


/*
    Suppose a number to reverse is 123
    It can be reversed in following way

    Loop it until number ! = 0
        1st Iteration
            reverse = 0
            remainder = 123 % 10 = 3
            temp = 123 / 10 = 12

            result = (0 * 10 ) + 3 = 3
        2nd Iteration
            reverse = 3
            remainder = 12 % 10 = 2
            temp = 12 / 10

            result = (3 * 10) + 2 = 32
        3rd Iteration
            reverse = 32
            remainder = 1 % 10 = 1
            temp = 1 / 10 = 0

            result = (32 * 10) + 1 = 321
    output = 321

    Although according to question it will work perfectly within range but
    we also have to consider MIN and MAX ranges for Integer

 */