package com.harsh.sharma.leetcode.easy

/*

    345. Reverse Vowels of a String

    https://leetcode.com/problems/reverse-vowels-of-a-string/

 */

fun Char.isVowel() = "aeiou".contains(this.toLowerCase())

fun reverseVowelsOne(s: String): String {
    var left = 0
    var right = s.length - 1
    val res = s.toCharArray()

    while (left < right) {
        while (left < right && !res[left].isVowel()) {
            left++
        }

        while (right > left && !res[right].isVowel()) {
            right--
        }

        if (left < right) {
            val temp = res[right]
            res[right] = res[left]
            res[left] = temp
            left++
            right--
        }
    }
    return res.joinToString("")
}

fun reverseVowelsTwo(s: String): String {
    val reversed = s.toCharArray().filter { it.isVowel() }.reversed()
    val result = StringBuilder()
    var i = 0
    for (c in s) {
        result.append(
            if (c.isVowel()) reversed[i].also { i++ }
            else c
        )
    }
    return result.toString()
}

fun main() {
    println(reverseVowelsOne("hello"))
    println(reverseVowelsOne("leetcode"))
}
