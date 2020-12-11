package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    643. Maximum Average Subarray I

    https://leetcode.com/problems/maximum-average-subarray-i/

 */

fun findMaxAverage(nums: IntArray, k: Int): Double {
    val sum = IntArray(nums.size)
    sum[0] = nums[0]
    for (i in 1 until nums.size) sum[i] = sum[i - 1] + nums[i]
    var res = sum[k - 1] * 1.0 / k
    for (i in k until nums.size) {
        res = Math.max(res, (sum[i] - sum[i - k]) * 1.0 / k)
    }
    return res
}

fun findMaxAverage1(nums: IntArray, k: Int): Double {
    var sum = 0.0
    for (i in 0 until k) sum += nums[i]
    var res = sum
    for (i in k until nums.size) {
        sum += nums[i] - nums[i - k].toDouble()
        res = Math.max(res, sum)
    }
    return res / k
}

fun main() {
    findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4).printAndNewLine()
}