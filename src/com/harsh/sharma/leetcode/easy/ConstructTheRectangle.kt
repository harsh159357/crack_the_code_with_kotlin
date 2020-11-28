package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printArrayElementsEndNewLine
import kotlin.math.roundToInt
import kotlin.math.sqrt

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
    constructRectangle(4).printArrayElementsEndNewLine()
    constructRectangle(37).printArrayElementsEndNewLine()
    constructRectangle(122122).printArrayElementsEndNewLine()
}
