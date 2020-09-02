package com.harsh.sharma.leetcode.easy

/*
    125. Valid Palindrome

    https://leetcode.com/problems/valid-palindrome/

 */

//Using Regular Expression
fun isPalindromeRegex(s: String): Boolean {
    val filteredString = s.replace("[^a-zA-Z0-9]".toRegex(), "").toLowerCase()
    return filteredString == filteredString.reversed()
}

//Without Regular Expression
fun isPalindromeNoRegex(s: String): Boolean {
    val filteredString = StringBuffer()
    for (index in s.indices) {
        if (Character.isLetter(s[index]) || Character.isDigit(s[index])) filteredString.append(s[index].toLowerCase())
    }

    return filteredString.toString() == filteredString.reverse().toString()
}

fun isPalindrome(s: String): Boolean {
    val charMap = CharArray(256)
    for (i in 0..9) charMap['0'.toInt() + i] =
        (1 + i).toChar() // numeric - don't use 0 as it's reserved for illegal chars
    for (i in 0..25) {
        charMap['A'.toInt() + i] = (11 + i).toChar()
        charMap['a'.toInt() + i] = charMap['A'.toInt() + i] //alphabetic, ignore cases, continue from 11
    }
    var start = 0
    var end = s.length - 1
    while (start < end) {
        when {
            charMap[s[start].toInt()].toInt() == 0 -> start++
            charMap[s[end].toInt()].toInt() == 0
            -> end--
            charMap[s[start++].toInt()] != charMap[s[end--].toInt()] -> return false
        }
    }
    return true
}

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
    println(isPalindrome("0P"))
}
