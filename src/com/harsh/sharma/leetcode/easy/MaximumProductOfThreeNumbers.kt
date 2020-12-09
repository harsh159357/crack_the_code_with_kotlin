package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine
import java.util.*


/*

    628. Maximum Product of Three Numbers

    https://leetcode.com/problems/maximum-product-of-three-numbers/

 */

fun maximumProduct(nums: IntArray): Int {
    Arrays.sort(nums)
    return Math.max(
        nums[0] * nums[1] * nums[nums.size - 1],
        nums[nums.size - 1] * nums[nums.size - 2] * nums[nums.size - 3]
    )
}

fun maximumProduct1(nums: IntArray): Int {
    var min1 = Int.MAX_VALUE
    var min2 = Int.MAX_VALUE
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE
    var max3 = Int.MIN_VALUE
    for (n in nums) {
        if (n <= min1) {
            min2 = min1
            min1 = n
        } else if (n <= min2) {     // n lies between min1 and min2
            min2 = n
        }
        if (n >= max1) {            // n is greater than max1, max2 and max3
            max3 = max2
            max2 = max1
            max1 = n
        } else if (n >= max2) {     // n lies between max1 and max2
            max3 = max2
            max2 = n
        } else if (n >= max3) {     // n lies between max2 and max3
            max3 = n
        }
    }
    return Math.max(min1 * min2 * max1, max1 * max2 * max3)
}

fun main() {
    maximumProduct(intArrayOf(1,2,3)).printAndNewLine()
    maximumProduct(intArrayOf(1,2,3,4)).printAndNewLine()
    maximumProduct(intArrayOf(-1,-2,-3)).printAndNewLine()
}