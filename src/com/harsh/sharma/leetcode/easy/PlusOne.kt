package com.harsh.sharma.leetcode.easy

/*

    66. Plus One

    https://leetcode.com/problems/plus-one/

 */

// My Try Not Optimized as There is conversion between Int and String
fun plusOne(digits: IntArray): IntArray {
    if (digits.isEmpty()) {
        return digits
    }

    var numberInString = ""

    digits.forEach { numberInString += it }

    val increment = numberInString.toBigInteger().inc()
    val iterateThis = increment.toString()

    val result = IntArray(iterateThis.length) { i -> i * i }


    for (i in 0..iterateThis.length - 1) {
        result[i] = iterateThis[i].toString().toInt()
    }

    return result
}

// Without any conversion
fun plusOneOptimized(digits: IntArray): IntArray {
    val n = digits.size
    for (i in n - 1 downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
    }
    val newNumber = IntArray(n + 1)
    newNumber[0] = 1
    return newNumber
}

fun main() {
    for (array
    in
    listOf(
        plusOne(intArrayOf(0)),
        plusOne(intArrayOf(9)),
        plusOne(intArrayOf(1, 2, 3)),
        plusOne(intArrayOf(4, 3, 2, 1)),
        // Your solution will fail for this input if you have used Integer.parseInt
        plusOne(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)),
        // Your solution will fail for this input if you have used Long.parseLong
        plusOne(
            intArrayOf(
                7,
                2,
                8,
                5,
                0,
                9,
                1,
                2,
                9,
                5,
                3,
                6,
                6,
                7,
                3,
                2,
                8,
                4,
                3,
                7,
                9,
                5,
                7,
                7,
                4,
                7,
                4,
                9,
                4,
                7,
                0,
                1,
                1,
                1,
                7,
                4,
                0,
                0,
                6
            )
        )
        // So BigInteger needs to be used for parsing for above two
    )) {

        for (item in array) {
            print("$item\t")
        }
        println()
    }

    for (array
    in
    listOf(
        plusOneOptimized(intArrayOf(0)),
        plusOneOptimized(intArrayOf(9)),
        plusOneOptimized(intArrayOf(1, 2, 3)),
        plusOneOptimized(intArrayOf(4, 3, 2, 1)),
        plusOneOptimized(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)),
        plusOneOptimized(
            intArrayOf(
                7,
                2,
                8,
                5,
                0,
                9,
                1,
                2,
                9,
                5,
                3,
                6,
                6,
                7,
                3,
                2,
                8,
                4,
                3,
                7,
                9,
                5,
                7,
                7,
                4,
                7,
                4,
                9,
                4,
                7,
                0,
                1,
                1,
                1,
                7,
                4,
                0,
                0,
                6
            )
        )
    )) {

        for (item in array) {
            print("$item\t")
        }
        println()
    }

}