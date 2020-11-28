package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printArrayElements

/*

    167. Two Sum II - Input array is sorted

    https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

 */

fun twoSum(numbers: IntArray, target: Int): IntArray {
    val map: HashMap<Int, Int> = HashMap()
    for (i in numbers.indices) {
        val complement = target - numbers[i]
        if (map.containsKey(complement)) {
            return intArrayOf((map[complement]!!) + 1, i + 1)
        } else {
            map[numbers[i]] = i
        }
    }
    return intArrayOf(0, 0)
}

fun main() {
    twoSum2(intArrayOf(4, 8, 10, 13), 17).printArrayElements()
}