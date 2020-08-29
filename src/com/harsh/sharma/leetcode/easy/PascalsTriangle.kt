package com.harsh.sharma.leetcode.easy

import java.util.*


/*

    118. Pascal's Triangle

    https://leetcode.com/problems/pascals-triangle/

 */


fun generate(numRows: Int): List<MutableList<Int>>? {
    val triangle: MutableList<MutableList<Int>> =
        ArrayList()

    // First base case; if user requests zero rows, they get zero rows.
    if (numRows == 0) {
        return triangle
    }

    // Second base case; first row is always [1].
    triangle.add(ArrayList())
    triangle[0].add(1)
    for (rowNum in 1 until numRows) {
        val row: MutableList<Int> = ArrayList()
        val prevRow: List<Int> = triangle[rowNum - 1]

        // The first row element is always 1.
        row.add(1)

        // Each triangle element (other than the first and last of each row)
        // is equal to the sum of the elements above-and-to-the-left and
        // above-and-to-the-right.
        for (j in 1 until rowNum) {
            row.add(prevRow[j - 1] + prevRow[j])
        }

        // The last row element is always 1.
        row.add(1)
        triangle.add(row)
    }
    return triangle
}

fun main() {
    println("Pascal's Triangle for input 5 \n=========================")
    for (item in generate(5)!!) {
        for(iterate in item) {
            print(iterate)
        }
        println()
    }
    println("=========================")

    println("Pascal's Triangle for input 4 \n=========================")
    for (item in generate(4)!!) {
        for(iterate in item) {
            print(iterate)
        }
        println()
    }
    println("=========================")

    println("Pascal's Triangle for input 7 \n=========================")
    for (item in generate(7)!!) {
        for(iterate in item) {
            print(iterate)
        }
        println()
    }
    println("=========================")
    println("Pascal's Triangle for input 9 \n=========================")
    for (item in generate(9)!!) {
        for(iterate in item) {
            print(iterate)
        }
        println()
    }
    println("=========================")
}