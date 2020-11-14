package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printArrayElements

/*

    500. Keyboard Row

    https://leetcode.com/problems/keyboard-row/

 */

fun findWords(words: Array<String>): Array<String> {
    val kr1 = hashSetOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p')
    val kr2 = hashSetOf('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l')
    val kr3 = hashSetOf('z', 'x', 'c', 'v', 'b', 'n', 'm')

    val result = ArrayList<String>()
    words.forEach {

        when {
            kr1.containsAll(it.toLowerCase().toHashSet()) ||
                    kr2.containsAll(it.toLowerCase().toHashSet()) ||
                    kr3.containsAll(it.toLowerCase().toHashSet()) -> result.add(it)
        }
    }
    return result.toTypedArray()
}

fun main() {
    findWords(arrayOf("Hello", "Alaska", "Dad", "Peace")).printArrayElements()
}
