package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printArrayElements

/*

    645. Set Mismatch

    https://leetcode.com/problems/set-mismatch/

 */

fun findErrorNums(nums: IntArray): IntArray? {
    var dup = -1
    var missing = -1
    for (i in 1..nums.size) {
        var count = 0
        for (j in nums.indices) {
            if (nums[j] == i) count++
        }
        if (count == 2) dup = i else if (count == 0) missing = i
    }
    return intArrayOf(dup, missing)
}

fun findErrorNums1(nums: IntArray): IntArray? {
    var dup = -1
    var missing = -1
    for (i in 1..nums.size) {
        var count = 0
        for (j in nums.indices) {
            if (nums[j] == i) count++
        }
        if (count == 2) dup = i else if (count == 0) missing = i
        if (dup > 0 && missing > 0) break
    }
    return intArrayOf(dup, missing)
}

fun main() {
    findErrorNums1(intArrayOf(1,2,2,4))?.printArrayElements()
}