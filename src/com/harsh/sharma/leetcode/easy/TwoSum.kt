package com.harsh.sharma.leetcode.easy
/*
    1. Two Sum [Easy]

    https://leetcode.com/problems/two-sum/

 */

// Brute Force
fun twoSum1(nums: IntArray, target: Int): IntArray {
    for (i in 0..nums.size - 1) {
        for (j in (i + 1)..nums.size - 1) {
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
            return intArrayOf(map.get(complement)!!, i)
        } else {
            map.put(nums[i], i)
        }
    }
    return intArrayOf(0, 0)
}

fun main() {
    println("Brute Force")
    for (i in twoSum1(intArrayOf(2, 7, 11, 15), 9)) {
        print("$i ")
    }
    println()
    println("Two Pass")
    for (i in twoSum2(intArrayOf(1, 5, 6, 15), 11)) {
        print("$i ")
    }
    println()
    println("One Pass")
    for (i in twoSum2(intArrayOf(4, 8, 10, 13), 17)) {
        print("$i ")
    }
    println()
}

