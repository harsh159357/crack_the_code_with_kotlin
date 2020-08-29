package com.harsh.sharma.leetcode.easy

/*

    26. Remove Duplicates from Sorted Array

    https://leetcode.com/problems/remove-duplicates-from-sorted-array/

 */

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var i = 0
    for (j in 1 until nums.size) {
        if (nums[j] != nums[i]) {
            i++
            nums[i] = nums[j]
        }
    }
    return i + 1
}

fun main() {
    println(removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))

    println(removeDuplicates(intArrayOf(1, 1, 2)))

    println(removeDuplicates(intArrayOf(1,1,2,2,3,3)))
}