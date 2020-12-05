package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printArrayElementsEndNewLine
import java.util.*


/*

    599. Minimum Index Sum of Two Lists

    https://leetcode.com/problems/minimum-index-sum-of-two-lists/

 */

fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String>? {
    val map = HashMap<String, Int?>()
    for (i in list1.indices) map[list1[i]] = i
    val res: MutableList<String> = ArrayList()
    var min_sum = Int.MAX_VALUE
    var sum: Int
    var j = 0
    while (j < list2.size && j <= min_sum) {
        if (map.containsKey(list2[j])) {
            sum = j + map[list2[j]]!!
            if (sum < min_sum) {
                res.clear()
                res.add(list2[j])
                min_sum = sum
            } else if (sum == min_sum) res.add(list2[j])
        }
        j++
    }
    return res.toTypedArray()
}

fun main() {
    findRestaurant(
        arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
        arrayOf("Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun")
    )?.printArrayElementsEndNewLine()

    findRestaurant(
        arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
        arrayOf("KFC", "Shogun", "Burger King")
    )?.printArrayElementsEndNewLine()

    findRestaurant(
        arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
        arrayOf("KFC", "Burger King", "Tapioca Express", "Shogun")
    )?.printArrayElementsEndNewLine()

    findRestaurant(
        arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
        arrayOf("KNN", "KFC", "Burger King", "Tapioca Express", "Shogun")
    )?.printArrayElementsEndNewLine()

    findRestaurant(
        arrayOf("KFC"),
        arrayOf("KFC")
    )?.printArrayElementsEndNewLine()
}