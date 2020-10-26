package com.harsh.sharma.leetcode.easy

import java.util.*


/*

    412. Fizz Buzz

    https://leetcode.com/problems/fizz-buzz/

 */

fun fizzBuzzNaive(n: Int): List<String>? {

    // ans list
    val ans: MutableList<String> = ArrayList()
    for (num in 1..n) {
        val divisibleBy3 = num % 3 == 0
        val divisibleBy5 = num % 5 == 0
        if (divisibleBy3 && divisibleBy5) {
            // Divides by both 3 and 5, add FizzBuzz
            ans.add("FizzBuzz")
        } else if (divisibleBy3) {
            // Divides by 3, add Fizz
            ans.add("Fizz")
        } else if (divisibleBy5) {
            // Divides by 5, add Buzz
            ans.add("Buzz")
        } else {
            // Not divisible by 3 or 5, add the number
            ans.add(num.toString())
        }
    }
    return ans
}
