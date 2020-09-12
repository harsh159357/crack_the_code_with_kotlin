package com.harsh.sharma.leetcode.easy

/*

    189. Rotate Array

    https://leetcode.com/problems/rotate-array/

 */

fun rotateBruteForce(nums: IntArray, k: Int) {
    // speed up the rotation
    var k = k
    k %= nums.size
    var temp: Int
    var previous: Int
    for (i in 0 until k) {
        previous = nums[nums.size - 1]
        for (j in nums.indices) {
            temp = nums[j]
            nums[j] = previous
            previous = temp
        }
    }
}

fun rotateExtraArray(nums: IntArray, k: Int) {
    val a = IntArray(nums.size)
    for (i in nums.indices) {
        a[(i + k) % nums.size] = nums[i]
    }
    for (i in nums.indices) {
        nums[i] = a[i]
    }
}

fun rotateCyclicReplacements(nums: IntArray, k: Int) {
    var k = k
    k %= nums.size
    var count = 0
    var start = 0
    while (count < nums.size) {
        var current = start
        var prev = nums[start]
        do {
            val next = (current + k) % nums.size
            val temp = nums[next]
            nums[next] = prev
            prev = temp
            current = next
            count++
        } while (start != current)
        start++
    }
}


fun reverse(nums: IntArray, start: Int, end: Int) {
    var start = start
    var end = end
    while (start < end) {
        val temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp
        start++
        end--
    }
}

fun rotate(nums: IntArray, k: Int) {
    var k = k
    k %= nums.size
    reverse(nums, 0, nums.size - 1)
    reverse(nums, 0, k - 1)
    reverse(nums, k, nums.size - 1)
}
