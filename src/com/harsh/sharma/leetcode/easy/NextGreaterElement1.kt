package com.harsh.sharma.leetcode.easy

/*

    496. Next Greater Element I

    https://leetcode.com/problems/next-greater-element-i/

 */

fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    return IntArray(nums1.size) { i ->
        val num1 = nums1[i]

        var found = false
        var result = -1
        for (j in nums2.indices) {
            val num2 = nums2[j]
            if (!found && num2 == num1) {
                found = true
            } else if (found && num2 > num1) {
                result = num2
                break
            }
        }

        result
    }
}

fun main() {
    println(nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 3, 4, 2)).forEach {
        print("$it\t")
    })
    println(nextGreaterElement(intArrayOf(2, 4), intArrayOf(1, 2, 3, 4)).forEach {
        print("$it\t")
    })
}