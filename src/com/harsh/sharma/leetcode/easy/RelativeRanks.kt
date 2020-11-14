package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printArrayElements

/*

    506. Relative Ranks

    https://leetcode.com/problems/relative-ranks/

 */

fun findRelativeRanks(nums: IntArray): Array<String> {
    var sn = nums.clone()
    sn.sort()
    var strArr = ArrayList<String>()
    for (e in nums) {
        var index = sn.binarySearch(e)
        index = nums.size - index
        if (index <= 3) {
            strArr.add(
                when (index) {
                    1 -> {
                        "Gold Medal"
                    }
                    2 -> {
                        "Silver Medal"
                    }
                    else -> {
                        "Bronze Medal"
                    }
                }
            )
        } else {
            strArr.add(index.toString())
        }
    }
    return strArr.toTypedArray()
}


fun main() {
    findRelativeRanks(intArrayOf(5, 4, 3, 2, 1)).printArrayElements()
}