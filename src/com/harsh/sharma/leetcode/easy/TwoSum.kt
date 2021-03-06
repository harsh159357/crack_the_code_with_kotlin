package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printArrayElementsEndNewLine

/*

    1. Two Sum

    https://leetcode.com/problems/two-sum/

 */

// Brute Force
fun twoSum1(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in (i + 1) until nums.size) {
            if ((nums[i] + nums[j]) == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf(0, 0)
}

// Two Pass
fun twoSum2(nums: IntArray, target: Int): IntArray {
    val map: MutableMap<Int, Int?> = HashMap()
    for (i in nums.indices) {
        map[nums[i]] = i
    }
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement) && map[complement] != i) {
            return intArrayOf(i, map[complement]!!)
        }
    }
    return intArrayOf(0, 0)
}


// One Pass
fun twoSum3(nums: IntArray, target: Int): IntArray {
    val map: HashMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        } else {
            map[nums[i]] = i
        }
    }
    return intArrayOf(0, 0)
}

fun main() {
    println("Brute Force")
    twoSum1(intArrayOf(2, 7, 11, 15), 9).printArrayElementsEndNewLine()

    println("Two Pass")
    twoSum2(intArrayOf(1, 5, 6, 15), 11).printArrayElementsEndNewLine()

    println("One Pass")
    twoSum2(intArrayOf(4, 8, 10, 13), 17).printArrayElementsEndNewLine()
}

