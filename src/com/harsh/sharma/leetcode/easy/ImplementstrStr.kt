package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.util.printAndNewLine

/*

    28. Implement strStr()

    https://leetcode.com/problems/implement-strstr/

 */

// My Try
fun strStr(haystack: String, needle: String): Int {
    if (haystack == needle || needle == "")
        return 0
    else {
        if (haystack.length < needle.length) return -1

        var firstCharFound = false
        var indexForFirst = -1

        for (index in haystack.indices) {

            when {
                !firstCharFound -> {
                    if (haystack[index] == needle[0]) {
                        firstCharFound = true
                        indexForFirst = index
                    }
                }
                else -> {
                    val lastIndex = indexForFirst + needle.length

                    when {
                        lastIndex <= haystack.length
                                && haystack.substring(indexForFirst, lastIndex) == needle
                        -> return index.dec()

                        index == haystack.length - 1
                        -> return -1

                        else
                        -> indexForFirst = indexForFirst.inc()

                    }
                }
            }

        }
        return indexForFirst
    }
}

// Best Upvoted Answer Try with explanation
fun strStr2(haystack: String, needle: String): Int {
    var i = 0
    while (true) {
        // The length of haystack
        var j = 0
        while (true) {
            // The length of needle
            if (j == needle.length) return i // If at this point we have navigated through the entire length of needle, we have found a solution, haystack[i].
            if (i + j == haystack.length) return -1 // This happens when we run out of elements in haystack, but there are still elements in needle.
            if (needle[j] != haystack[i + j]) break // We stop comparing after needle[j], so i will be incremented and cycle repeats itself.
            j++
        }
        i++
    }
}

fun main() {
    strStr("hello", "ll").printAndNewLine()

    strStr("aaaaa", "bba").printAndNewLine()

    strStr("aaa", "aaa").printAndNewLine()

    strStr("aaa", "aaaa").printAndNewLine()

    strStr("a", "a").printAndNewLine()

    strStr("mississippi", "issipi").printAndNewLine()

    strStr("mississippi", "issip").printAndNewLine()

    strStr("mississippi", "pi").printAndNewLine()
}

