package com.harsh.sharma.leetcode.easy

import kotlin.math.sqrt
import kotlin.math.roundToInt

/*

    492. Construct the Rectangle

    https://leetcode.com/problems/construct-the-rectangle/

 */

fun constructRectangle(area: Int): IntArray {
    if (area == 0) {
        return intArrayOf(0, 0)
    }
    var width = sqrt(area.toDouble()).roundToInt()
    while (area % width != 0) {
        width--;
    }
    return intArrayOf(area / width, width)
}

fun main() {
    println(constructRectangle(4).forEach {
        print("$it\t")
    })
    println(constructRectangle(37).forEach {
        print("$it\t")
    })
    println(constructRectangle(122122).forEach {
        print("$it\t")
    })
}
