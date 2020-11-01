package com.harsh.sharma.leetcode.easy

/*

    453. Minimum Moves to Equal Array Elements

    https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

 */

fun minMoves(nums: IntArray): Int {
    return nums.sum() - nums.size * nums.min()!!
}

fun main() {
    println(intArrayOf(1,2,3))
}