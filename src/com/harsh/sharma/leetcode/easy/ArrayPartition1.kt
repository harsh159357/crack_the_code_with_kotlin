package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    561. Array Partition I

    https://leetcode.com/problems/array-partition-i/

 */

fun arrayPairSum(nums: IntArray): Int {
    return nums.sortedArray().filterIndexed { index, _ -> index % 2 == 0 }.sum()
}

fun main() {
    arrayPairSum(intArrayOf(1, 4, 3, 2)).printAndNewLine()
}