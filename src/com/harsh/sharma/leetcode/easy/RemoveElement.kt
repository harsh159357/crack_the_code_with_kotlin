package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    27. Remove Element

    https://leetcode.com/problems/remove-element/submissions/

 */
fun removeElement(nums: IntArray, `val`: Int): Int {
    var i = 0
    for (j in nums.indices) {
        if (nums[j] != `val`) {
            nums[i] = nums[j]
            i++
        }
    }
    return i
}

fun removeElement2(nums: IntArray, `val`: Int): Int {
    var i = 0
    var n = nums.size
    while (i < n) {
        if (nums[i] == `val`) {
            nums[i] = nums[n - 1]
            n--
        } else {
            i++
        }
    }
    return n
}

fun main() {
    removeElement(intArrayOf(3, 2, 2, 3), 3).printAndNewLine()
    removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 3).printAndNewLine()
    removeElement2(intArrayOf(3, 2, 2, 3), 3).printAndNewLine()
    removeElement2(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 3).printAndNewLine()
}