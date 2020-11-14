package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printArrayElements

/*

    448. Find All Numbers Disappeared in an Array

    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

 */

fun findDisappearedNumbersOne(nums: IntArray): List<Int> {
    var i = 0
    while (i < nums.size) {
        if (nums[i] != nums[nums[i] - 1]) {
            swap(nums, i, nums[i] - 1)
            --i
        }
        i++
    }
    return (1..nums.size).filter { nums[it - 1] != it }.toList()
}

private fun swap(nums: IntArray, x: Int, y: Int) {
    nums[x] += nums[y]
    nums[y] = nums[x] - nums[y]
    nums[x] -= nums[y]
}

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    nums.indices.forEach { i ->
        nums[(nums[i] - 1) % nums.size] += nums.size
    }
    return (1..nums.size).filter { nums[it - 1] <= nums.size }.toList()
}

fun main() {
    findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)).printArrayElements()
}