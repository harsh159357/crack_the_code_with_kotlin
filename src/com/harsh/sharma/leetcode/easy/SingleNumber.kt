package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine
import java.util.*


/*

    136. Single Number

    https://leetcode.com/problems/single-number/

 */

fun singleNumberListOperation(nums: IntArray): Int {
    val noDuplicateList: MutableList<Int> = ArrayList()
    for (i in nums) {
        if (!noDuplicateList.contains(i)) {
            noDuplicateList.add(i)
        } else {
            noDuplicateList.remove(i)
        }
    }
    return noDuplicateList[0]
}

fun singleNumberHashTable(nums: IntArray): Int {
    val hashTable = HashMap<Int, Int>()
    for (i in nums) {
        hashTable[i] = hashTable.getOrDefault(i, 0) + 1
    }
    for (i in nums) {
        if (hashTable[i] == 1) {
            return i
        }
    }
    return 0
}

fun singleNumberMath(nums: IntArray): Int {
    var sumOfSet = 0
    var sumOfNums = 0
    val set: MutableSet<Int> = HashSet()
    for (num in nums) {
        if (!set.contains(num)) {
            set.add(num)
            sumOfSet += num
        }
        sumOfNums += num
    }
    return 2 * sumOfSet - sumOfNums
}

fun singleNumber(nums: IntArray): Int {
    var a = 0
    for (i in nums) {
        a = a xor i
    }
    return a
}


fun main() {
    singleNumber(intArrayOf(2, 2, 1)).printAndNewLine()
    singleNumber(intArrayOf(4, 1, 2, 1, 2)).printAndNewLine()
}