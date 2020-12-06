package com.harsh.sharma.leetcode.easy

/*

    605. Can Place Flowers

    https://leetcode.com/problems/can-place-flowers/

 */

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var i = 0
    var count = 0
    while (i < flowerbed.size) {
        if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)) {
            flowerbed[i] = 1
            count++
        }
        i++
    }
    return count >= n
}

fun canPlaceFlowers1(flowerbed: IntArray, n: Int): Boolean {
    var i = 0
    var count = 0
    while (i < flowerbed.size) {
        if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)) {
            flowerbed[i++] = 1
            count++
        }
        if (count >= n) return true
        i++
    }
    return false
}