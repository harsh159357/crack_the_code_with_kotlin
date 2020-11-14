package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine
import java.util.*

/*

    414. Third Maximum Number

    https://leetcode.com/problems/third-maximum-number/

 */

fun thirdMax(nums: IntArray): Int {
    val maxHeap = PriorityQueue(nums.size, compareByDescending<Int> { it })
    nums.toSet().forEach {
        maxHeap.add(it)
    }
    if (maxHeap.size < 3) {
        return maxHeap.poll()
    }
    maxHeap.poll()
    maxHeap.poll()
    return maxHeap.poll()
}

fun thirdMax2(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    var max0 = Integer.MIN_VALUE
    var max1 = Integer.MIN_VALUE
    var max2 = Integer.MIN_VALUE
    nums.forEach {
        map[it] = it
        when {
            it > max0 -> {
                max2 = max1
                max1 = max0
                max0 = it
            }
            it > max1 && it != max0 -> {
                max2 = max1
                max1 = it
            }
            it > max2 && it != max1 && it != max0 -> {
                max2 = it
            }
        }
    }
    return if (map.size < 3) max0 else max2
}

fun main() {
    thirdMax2(intArrayOf(3, 2, 1)).printAndNewLine()
    thirdMax2(intArrayOf(1, 2)).printAndNewLine()
    thirdMax2(intArrayOf(2, 2, 3, 1)).printAndNewLine()
}