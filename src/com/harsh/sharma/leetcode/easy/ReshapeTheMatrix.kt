package com.harsh.sharma.leetcode.easy

/*

    566. Reshape the Matrix

    https://leetcode.com/problems/reshape-the-matrix/

 */
fun matrixReshape(nums: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    val res = Array(r) { IntArray(c) }
    if (nums.size == 0 || r * c != nums.size * nums[0].size) return nums
    var count = 0
    for (i in nums.indices) {
        for (j in 0 until nums[0].size) {
            res[count / c][count % c] = nums[i][j]
            count++
        }
    }
    return res
}

fun main() {
    matrixReshape(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 1, 4).also {
        it.forEach {
            println(it.joinToString(" "))
        }
    }

    matrixReshape(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 4, 1).also {
        it.forEach {
            println(it.joinToString(" "))
        }
    }

    matrixReshape(arrayOf(intArrayOf(1, 2, 3, 4)), 2, 2).also {
        it.forEach {
            println(it.joinToString(" "))
        }
    }

    matrixReshape(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 2, 4).also {
        it.forEach {
            println(it.joinToString(" "))
        }
    }
}