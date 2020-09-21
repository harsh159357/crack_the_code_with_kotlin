package com.harsh.sharma.leetcode.easy

import java.util.*


/*

    217. Contains Duplicate

    https://leetcode.com/problems/contains-duplicate/

 */

fun containsDuplicateNaive(nums: IntArray): Boolean {
    for (i in nums.indices) {
        for (j in 0 until i) {
            if (nums[j] == nums[i]) return true
        }
    }
    return false
}

fun containsDuplicateSorting(nums: IntArray): Boolean {
    Arrays.sort(nums)
    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1]) return true
    }
    return false
}

fun containsDuplicateHashTable(nums: IntArray): Boolean {
    val set: MutableSet<Int> = HashSet(nums.size)
    for (x in nums) {
        if (set.contains(x)) return true
        set.add(x)
    }
    return false
}

fun main() {
    println(containsDuplicateSorting(intArrayOf(1,2,3,1)))
    println(containsDuplicateSorting(intArrayOf(1,2,3,4)))
    println(containsDuplicateSorting(intArrayOf(1,1,1,3,3,4,3,2,4,2)))
}