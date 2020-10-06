package com.harsh.sharma.leetcode.easy

/*

    283. Move Zeroes

    https://leetcode.com/problems/move-zeroes/

 */

fun moveZeroes(nums: IntArray): Unit {
    var lastNonZeroFoundAt = 0
    for (i in nums.indices) {
        if (nums[i] != 0) {
            nums[lastNonZeroFoundAt++] = nums[i]
        }
    }

    for (i in lastNonZeroFoundAt until nums.size) {
        nums[i] = 0
    }
}
