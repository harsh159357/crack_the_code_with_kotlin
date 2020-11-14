package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    292. Nim Game

    https://leetcode.com/problems/nim-game/

 */

fun canWinNim(n: Int): Boolean {
    return n % 4 != 0
}

fun main() {
    canWinNim(4).printAndNewLine()
    canWinNim(1).printAndNewLine()
    canWinNim(2).printAndNewLine()
}