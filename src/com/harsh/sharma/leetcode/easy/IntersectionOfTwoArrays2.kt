package com.harsh.sharma.leetcode.easy

/*

    350. Intersection of Two Arrays II

    https://leetcode.com/problemset/algorithms/?difficulty=Easy

 */

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val freq = HashMap<Int, Int>()
    for (num in nums1) {
        freq[num] = freq.getOrDefault(num, 0) + 1
    }
    val res = mutableListOf<Int>()
    for (num in nums2) {
        val count = freq[num]
        if (count != null && count != 0) {
            res.add(num)
            freq[num] = count - 1
        }
    }
    return res.toIntArray()
}

fun main() {
    for (i in intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))!!) {
        print("$i ")
    }
    println()

    for (j in intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4))!!) {
        print("$j ")
    }
}