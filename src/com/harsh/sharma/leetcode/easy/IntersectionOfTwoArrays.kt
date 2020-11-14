package com.harsh.sharma.leetcode.easy

import java.util.*


/*

    349. Intersection of Two Arrays

    https://leetcode.com/problems/intersection-of-two-arrays/

 */

fun setIntersection(set1: HashSet<Int>, set2: HashSet<Int>): IntArray? {
    val output = IntArray(set1.size)
    var index = 0
    for (s in set1) if (set2.contains(s)) output[index++] = s
    return output.copyOf(index)
}

fun intersectionOne(nums1: IntArray, nums2: IntArray): IntArray? {
    val set1 = HashSet<Int>()
    for (n in nums1) set1.add(n)
    val set2 = HashSet<Int>()
    for (n in nums2) set2.add(n)
    return if (set1.size < set2.size) setIntersection(set1, set2) else setIntersection(set2, set1)
}

fun intersection(nums1: IntArray, nums2: IntArray): IntArray? {
    val set1 = HashSet<Int>()
    for (n in nums1) set1.add(n)
    val set2 = HashSet<Int>()
    for (n in nums2) set2.add(n)
    set1.retainAll(set2)
    val output = IntArray(set1.size)
    var index = 0
    for (s in set1) output[index++] = s
    return output
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