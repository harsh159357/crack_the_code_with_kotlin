package com.harsh.sharma.leetcode.easy

/*

    88. Merge Sorted Array

    https://leetcode.com/problems/merge-sorted-array/

 */
class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        var write = m + n - 1
        var readA = m - 1
        var readB = n - 1

        while (readB >= 0) {
            when {
                (readA == -1) -> nums1[write--] = nums2[readB--]

                (nums1[readA] <= nums2[readB]) -> nums1[write--] = nums2[readB--]

                else -> nums1[write--] = nums1[readA--]
            }
        }

        nums1.forEach { print("$it\t") }
    }

    fun main() {
        merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
    }

}