package com.harsh.sharma.leetcode.easy

/*

    485. Max Consecutive Ones

    https://leetcode.com/problems/max-consecutive-ones/

 */

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var size = 0
    var ans = 0
    for (i in nums.indices) {
        if (nums[i] != 1) {
            ans = Math.max(ans, size)
            size = 0
        } else size++
    }
    return Math.max(ans, size)
}

fun main() {
    println(findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1)))
}
