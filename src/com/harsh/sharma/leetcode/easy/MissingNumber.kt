package com.harsh.sharma.leetcode.easy

import java.util.*


/*

    268. Missing Number

    https://leetcode.com/problems/missing-number/

 */

fun missingNumberSorting(nums: IntArray): Int {
    Arrays.sort(nums)

    // Ensure that n is at the last index
    if (nums[nums.size - 1] != nums.size) {
        return nums.size
    } else if (nums[0] != 0) {
        return 0
    }

    // If we get here, then the missing number is on the range (0, n)
    for (i in 1 until nums.size) {
        val expectedNum = nums[i - 1] + 1
        if (nums[i] != expectedNum) {
            return expectedNum
        }
    }

    // Array was not missing any numbers
    return -1
}

fun missingNumberHashSet(nums: IntArray): Int {
    val numSet: MutableSet<Int> = HashSet()
    for (num in nums) numSet.add(num)
    val expectedNumCount = nums.size + 1
    for (number in 0 until expectedNumCount) {
        if (!numSet.contains(number)) {
            return number
        }
    }
    return -1
}

fun missingNumberBitManipulation(nums: IntArray): Int {
    var missing = nums.size
    for (i in nums.indices) {
        missing = missing xor (i xor nums[i])
    }
    return missing
}

fun missingNumberGaussFormula(nums: IntArray): Int {
    val expectedSum = nums.size * (nums.size + 1) / 2
    var actualSum = 0
    for (num in nums) actualSum += num
    return expectedSum - actualSum
}

fun main() {
    println(missingNumberSorting(intArrayOf(3,0,1)))
    println(missingNumberSorting(intArrayOf(0,1)))
    println(missingNumberSorting(intArrayOf(9,6,4,2,3,5,7,0,1)))
    println(missingNumberSorting(intArrayOf(0)))
}