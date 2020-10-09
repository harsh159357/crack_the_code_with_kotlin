package com.harsh.sharma.leetcode.easy

/*

    303. Range Sum Query - Immutable

    https://leetcode.com/problems/range-sum-query-immutable/

 */

class NumArrayBruteForce(nums: IntArray) {
    private var data = IntArray(nums.size)

    init {
        data = nums
    }

    fun sumRange(i: Int, j: Int): Int {
        var sum = 0
        for (k in i..j) {
            sum += data[k]
        }
        return sum
    }
}

class NumArrayBruteCaching(nums: IntArray) {
    private var sum = IntArray(nums.size)

    init {
        sum = IntArray(nums.size + 1)
        for (i in nums.indices) {
            sum[i + 1] = sum[i] + nums[i]
        }
    }

    fun sumRange(i: Int, j: Int): Int {
        return sum[j + 1] - sum[i]
    }
}
