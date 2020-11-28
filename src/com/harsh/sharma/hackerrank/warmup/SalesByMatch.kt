package com.harsh.sharma.hackerrank.warmup

import com.harsh.sharma.util.printAndNewLine
import com.harsh.sharma.util.toArrayOfInt
import kotlin.collections.*

/*

    Sales by Match

    https://www.hackerrank.com/challenges/sock-merchant?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

 */


// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {

    val socksMap: MutableMap<Int, Int> = mutableMapOf()

    for (item in ar) {
        val keyValue = socksMap[item]
        if (keyValue != null && keyValue != 0) {
            socksMap[item] = keyValue.plus(1)
        } else {
            socksMap[item] = 1
        }
    }

    var noOfPairs: Int = 0
    for ((key, value) in socksMap) {
        noOfPairs += value / 2
    }
    return noOfPairs
}

fun main(args: Array<String>) {
    sockMerchant(9, toArrayOfInt(intArrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20))).printAndNewLine()
    sockMerchant(10, toArrayOfInt(intArrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3))).printAndNewLine()
}


