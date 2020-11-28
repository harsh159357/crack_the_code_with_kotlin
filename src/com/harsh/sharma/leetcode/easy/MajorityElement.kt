package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine
import java.util.*


/*

    169. Majority Element

    https://leetcode.com/problems/majority-element/

 */

fun majorityElementBruteForce(nums: IntArray): Int {
    val majorityCount = nums.size / 2
    for (num in nums) {
        var count = 0
        for (elem in nums) {
            if (elem == num) {
                count += 1
            }
        }
        if (count > majorityCount) {
            return num
        }
    }
    return -1
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private fun countNums(nums: IntArray): Map<Int, Int?> {
    val counts: MutableMap<Int, Int?> = HashMap()
    for (num in nums) {
        if (!counts.containsKey(num)) {
            counts[num] = 1
        } else {
            counts[num] = counts[num]!! + 1
        }
    }
    return counts
}

fun majorityElementHashMap(nums: IntArray): Int {
    val counts = countNums(nums)
    var majorityEntry: Map.Entry<Int, Int?>? = null
    for (entry in counts.entries) {
        if (majorityEntry == null || entry.value!! > majorityEntry.value!!) {
            majorityEntry = entry
        }
    }
    return majorityEntry!!.key
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
fun majorityElementSorting(nums: IntArray): Int {
    Arrays.sort(nums)
    return nums[nums.size / 2]
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private fun randRange(rand: Random, min: Int, max: Int): Int {
    return rand.nextInt(max - min) + min
}

private fun countOccurrences(nums: IntArray, num: Int): Int {
    var count = 0
    for (i in nums.indices) {
        if (nums[i] == num) {
            count++
        }
    }
    return count
}

fun majorityElementRandomization(nums: IntArray): Int {
    val rand = Random()
    val majorityCount = nums.size / 2
    while (true) {
        val candidate = nums[randRange(rand, 0, nums.size)]
        if (countOccurrences(nums, candidate) > majorityCount) {
            return candidate
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private fun countInRange(nums: IntArray, num: Int, lo: Int, hi: Int): Int {
    var count = 0
    for (i in lo..hi) {
        if (nums[i] == num) {
            count++
        }
    }
    return count
}

private fun majorityElementRec(nums: IntArray, lo: Int, hi: Int): Int {
    // base case; the only element in an array of size 1 is the majority
    // element.
    if (lo == hi) {
        return nums[lo]
    }

    // recurse on left and right halves of this slice.
    val mid = (hi - lo) / 2 + lo
    val left = majorityElementRec(nums, lo, mid)
    val right = majorityElementRec(nums, mid + 1, hi)

    // if the two halves agree on the majority element, return it.
    if (left == right) {
        return left
    }

    // otherwise, count each element and return the "winner".
    val leftCount = countInRange(nums, left, lo, hi)
    val rightCount = countInRange(nums, right, lo, hi)
    return if (leftCount > rightCount) left else right
}

fun majorityElementDivideAndConquer(nums: IntArray): Int {
    return majorityElementRec(nums, 0, nums.size - 1)
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

fun majorityElement(nums: IntArray): Int {
    var count = 0
    var candidate: Int? = null
    for (num in nums) {
        if (count == 0) {
            candidate = num
        }
        count += if (num == candidate) 1 else -1
    }
    return candidate!!
}

fun main() {
    majorityElement(intArrayOf(3, 2, 3)).printAndNewLine()
    majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)).printAndNewLine()
}