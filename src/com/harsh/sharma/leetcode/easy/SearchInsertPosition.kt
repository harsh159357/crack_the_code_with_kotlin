package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    35. Search Insert Position

    https://leetcode.com/problems/search-insert-position/

 */

// My Try
fun searchInsert(nums: IntArray, target: Int): Int {
    var index = 0;

    for (itemIndexInArray in nums.indices) {
        when {
            nums[itemIndexInArray] == target -> return itemIndexInArray

            target < nums[itemIndexInArray] && itemIndexInArray == 0 -> return 0

            target > nums[itemIndexInArray] && itemIndexInArray == nums.size - 1 -> return nums.size

            target < nums[itemIndexInArray] && target > nums[itemIndexInArray - 1] -> index = itemIndexInArray
        }
    }
    return index
}

// Remove all the numbers that are bigger or equal to the target, then return the size of the list

fun searchInsertOneLiner(nums: IntArray, target: Int): Int = nums.filterNot { target <= it }.size

/**
 * If the number is smaller then or equal to the target return the index, otherwise
 * all the numbers are less then the array and just return the size of the
 * array - (since we want the index out of bounds number)
 */
fun searchInsertLessNoOfLines(nums: IntArray, target: Int): Int {
    for (index in nums.indices) {
        if (target <= nums[index]) {
            return index
        }
    }
    return nums.size
}

fun main() {
    searchInsert(intArrayOf(1, 3, 5, 6), 5).printAndNewLine() // 2

    searchInsert(intArrayOf(1, 3, 5, 6), 2).printAndNewLine() // 1

    searchInsert(intArrayOf(1, 3, 5, 6), 7).printAndNewLine() // 4

    searchInsert(intArrayOf(1, 3, 5, 6), 0).printAndNewLine() // 0

    searchInsertOneLiner(intArrayOf(1, 3, 5, 6), 2).printAndNewLine() // 1

    searchInsertLessNoOfLines(intArrayOf(1, 3, 5, 6), 2).printAndNewLine() // 1
}