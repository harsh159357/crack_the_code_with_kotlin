package com.harsh.sharma.leetcode.easy

/*

    598. Range Addition II

    https://leetcode.com/problems/range-addition-ii/

 */

fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {
    val arr = Array(m) { IntArray(n) }
    for (op in ops) {
        for (i in 0 until op[0]) {
            for (j in 0 until op[1]) {
                arr[i][j] += 1
            }
        }
    }
    var count = 0
    for (i in 0 until m) {
        for (j in 0 until n) {
            if (arr[i][j] == arr[0][0]) count++
        }
    }
    return count
}

fun maxCount1(m: Int, n: Int, ops: Array<IntArray>): Int {
    var m = m
    var n = n
    for (op in ops) {
        m = Math.min(m, op[0])
        n = Math.min(n, op[1])
    }
    return m * n
}
