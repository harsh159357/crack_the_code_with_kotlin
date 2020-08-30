package com.harsh.sharma.leetcode.easy

import java.util.ArrayList

/*

    119. Pascal's Triangle II

    https://leetcode.com/problems/pascals-triangle-ii/

 */

fun getRow(rowIndex: Int): List<Int> {
    val triangle: MutableList<MutableList<Int>> =
        ArrayList()

    triangle.add(ArrayList())
    triangle[0].add(1)
    for (rowNum in 1 until rowIndex + 1) {
        val row: MutableList<Int> = ArrayList()
        val prevRow: List<Int> = triangle[rowNum - 1]

        row.add(1)

        for (j in 1 until rowNum) {
            row.add(prevRow[j - 1] + prevRow[j])
        }

        row.add(1)
        triangle.add(row)
    }
    return triangle[rowIndex]
}

fun main() {
    println("Pascal's Triangle for input 4 \n=========================")
    for (item in getRow(4)) {
        print("$item\t")
    }
    println("\n=========================")
    println("Pascal's Triangle for input 5 \n=========================")
    for (item in getRow(5)) {
        print("$item\t")
    }
    println("\n=========================")

    println("Pascal's Triangle for input 3 \n=========================")
    for (item in getRow(3)) {
        print("$item\t")
    }
    println("\n=========================")

    println("Pascal's Triangle for input 11 \n=========================")
    for (item in getRow(11)) {
        print("$item\t")
    }
    println("\n=========================")
}

