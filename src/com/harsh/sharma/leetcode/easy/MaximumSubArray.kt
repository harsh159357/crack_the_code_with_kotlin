package com.harsh.sharma.leetcode.easy

/*

    53. Maximum Sub array

    https://leetcode.com/problems/maximum-subarray/

 */

class MaximumSubArray {

    fun maxSubArray(nums: IntArray): Int {
        var maxSoFar = nums[0]
        var maxEndingHere = nums[0]
        for (i in 1..nums.size - 1) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i])
            maxSoFar = Math.max(maxSoFar, maxEndingHere)
        }
        return maxSoFar
    }

    fun main() {
        println(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }

}