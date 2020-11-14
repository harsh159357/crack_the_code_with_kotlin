package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine
import kotlin.math.max

/*

    198. House Robber

    https://leetcode.com/problems/house-robber/

 */

fun robOne(nums: IntArray): Int {
    var prev: Int = 0
    var curr: Int = 0

    for (n in nums) {
        val temp: Int = curr
        curr = max(prev + n, curr)
        prev = temp
    }
    return curr
}

fun robTwo(nums: IntArray): Int {
    if (nums.isEmpty()) return 0
    val maxArray = IntArray(nums.size) { 0 }
    for (i in nums.indices) {
        val prev = if (i > 0) {
            maxArray[i - 1]
        } else {
            0
        }
        val twoPrev = if (i > 1) {
            maxArray[i - 2]
        } else {
            0
        }
        maxArray[i] = maxOf(nums[i] + twoPrev, prev)
    }
    return maxArray[nums.size - 1]
}

fun main() {
    robOne(intArrayOf(1, 2, 3, 1)).printAndNewLine()
    robOne(intArrayOf(2, 7, 9, 3, 1)).printAndNewLine()
}