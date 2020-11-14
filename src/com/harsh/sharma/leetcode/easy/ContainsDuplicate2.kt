package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    219. Contains Duplicate II

    https://leetcode.com/problems/contains-duplicate-ii/

 */

fun containsNearbyDuplicateOne(nums: IntArray, k: Int): Boolean {
    val map = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        if (map[nums[i]] != null && i - map[nums[i]]!! <= k) {
            return true
        }
        map[nums[i]] = i
    }
    return false
}

fun containsNearbyDuplicateTwo(nums: IntArray, k: Int): Boolean {
    val set = HashSet<Int>()
    for (i in nums.indices) {
        if (set.contains(nums[i])) return true
        set.add(nums[i])
        if (set.size > k) {
            set.remove(nums[i - k])
        }
    }
    return false
}

fun containsNearbyDuplicateWorst(nums: IntArray, k: Int): Boolean {
    for (dp in 1..k) {
        for (i in 0 until nums.size - dp) {
            if (nums[i] == nums[i + dp]) {
                return true
            }
        }
    }
    return false
}

fun main() {
    containsNearbyDuplicateOne(intArrayOf(1, 2, 3, 1), 3).printAndNewLine()
    containsNearbyDuplicateOne(intArrayOf(1, 0, 1, 1), 1).printAndNewLine()
    containsNearbyDuplicateOne(intArrayOf(1, 2, 3, 1, 2, 3), 2).printAndNewLine()
    containsNearbyDuplicateOne(intArrayOf(), 2).printAndNewLine()
    containsNearbyDuplicateOne(intArrayOf(1, 1), 1).printAndNewLine()
    containsNearbyDuplicateOne(intArrayOf(1, 1), 2).printAndNewLine()
}