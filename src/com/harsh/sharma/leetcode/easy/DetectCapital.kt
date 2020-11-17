package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    520. Detect Capital

    https://leetcode.com/problems/detect-capital/

 */

fun detectCapitalUseOne(word: String): Boolean {
    val n = word.length
    var match1 = true
    var match2 = true
    var match3 = true

    // case 1: All capital
    for (i in 0 until n) {
        if (!Character.isUpperCase(word[i])) {
            match1 = false
            break
        }
    }
    if (match1) {
        return true
    }

    // case 2: All not capital
    for (i in 0 until n) {
        if (!Character.isLowerCase(word[i])) {
            match2 = false
            break
        }
    }
    if (match2) {
        return true
    }

    // case 3: All not capital except first
    if (!Character.isUpperCase(word[0])) {
        match3 = false
    }
    if (match3) {
        for (i in 1 until n) {
            if (!Character.isLowerCase(word[i])) {
                match3 = false
                break
            }
        }
    }
    return match3
}

fun detectCapitalUseTwo(word: String): Boolean {
    val n = word.length
    if (n == 1) {
        return true
    }

    // case 1: All capital
    if (Character.isUpperCase(word[0]) && Character.isUpperCase(word[1])) {
        for (i in 2 until n) {
            if (Character.isLowerCase(word[i])) {
                return false
            }
        }
        // case 2 and case 3
    } else {
        for (i in 1 until n) {
            if (Character.isUpperCase(word[i])) {
                return false
            }
        }
    }

    // if pass one of the cases
    return true
}

fun detectCapitalUse(word: String): Boolean {
    return word.matches("[A-Z]*|.[a-z]*".toRegex())
}

fun main() {
    detectCapitalUse("USA").printAndNewLine()
    detectCapitalUse("FlaG").printAndNewLine()
}