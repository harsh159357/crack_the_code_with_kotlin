package com.harsh.sharma.leetcode.easy

/*

    292. Nim Game

    https://leetcode.com/problems/nim-game/

 */

fun canWinNim(n: Int): Boolean {
    return n % 4 != 0
}

fun main() {
    println(canWinNim(4))
    println(canWinNim(1))
    println(canWinNim(2))
}