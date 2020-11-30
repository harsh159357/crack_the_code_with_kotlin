package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine
import java.util.*


/*

    575. Distribute Candies

    https://leetcode.com/problems/distribute-candies/

 */

var max_kind = 0
fun distributeCandies1(nums: IntArray): Int {
    permute(nums, 0)
    return max_kind
}

fun permute(nums: IntArray, l: Int) {
    if (l == nums.size - 1) {
        val set = HashSet<Int>()
        for (i in 0 until nums.size / 2) {
            set.add(nums[i])
        }
        max_kind = Math.max(max_kind, set.size)
    }
    for (i in l until nums.size) {
        swap(nums, i, l)
        permute(nums, l + 1)
        swap(nums, i, l)
    }
}

fun distributeCandies2(candies: IntArray): Int {
    var count = 0
    var i = 0
    while (i < candies.size && count < candies.size / 2) {
        if (candies[i] != Int.MIN_VALUE) {
            count++
            for (j in i + 1 until candies.size) {
                if (candies[j] == candies[i]) candies[j] = Int.MIN_VALUE
            }
        }
        i++
    }
    return count
}

fun distributeCandies3(candies: IntArray): Int {
    Arrays.sort(candies)
    var count = 1
    var i = 1
    while (i < candies.size && count < candies.size / 2) {
        if (candies[i] > candies[i - 1]) count++
        i++
    }
    return count
}

fun distributeCandies(candies: IntArray): Int {
    val set = HashSet<Int>()
    for (candy in candies) {
        set.add(candy)
    }
    return Math.min(set.size, candies.size / 2)
}

fun main() {
    distributeCandies(intArrayOf(1,1,2,2,3,3)).printAndNewLine()
    distributeCandies(intArrayOf(1,1,2,3)).printAndNewLine()
    distributeCandies(intArrayOf(6,6,6,6)).printAndNewLine()
}