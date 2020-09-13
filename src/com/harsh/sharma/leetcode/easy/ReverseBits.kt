package com.harsh.sharma.leetcode.easy

/*

    190. Reverse Bits

    https://leetcode.com/problems/reverse-bits/solution/

 */

fun reverseBits(n: Int): Int {
    var n = n
    var ans = 0
    for (i in 0..31) {
        ans = ans shl 1
        ans = ans or (n and 1)
        n = n shr 1
    }
    return ans
}
