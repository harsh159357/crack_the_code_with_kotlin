package com.harsh.sharma.leetcode.easy

/*

    14. Longest Common Prefix

    https://leetcode.com/problems/longest-common-prefix/

 */

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    var lowestLengthItem: Int = Integer.MAX_VALUE
    var longestCommonPrefix = ""

    for (i in strs) {
        if (i.length < lowestLengthItem) {
            lowestLengthItem = i.length
        }
    }


    for (i in 0 until lowestLengthItem) {
        var isAllItemsCheckedAndTheirPrefixSame = true
        longestCommonPrefix = strs[0].substring(0, i + 1)

        for (j in strs) {
            if (j.startsWith(longestCommonPrefix)) {
                isAllItemsCheckedAndTheirPrefixSame = isAllItemsCheckedAndTheirPrefixSame and true
            } else {
                isAllItemsCheckedAndTheirPrefixSame = isAllItemsCheckedAndTheirPrefixSame and false
            }
        }

        if (!isAllItemsCheckedAndTheirPrefixSame) {
            return longestCommonPrefix.substring(0, longestCommonPrefix.length - 1)
        }

    }

    return longestCommonPrefix
}

fun main() {
    println("Longest Common Prefix is : ${longestCommonPrefix(arrayOf("flower", "flow", "flight"))}")

    println("Longest Common Prefix is : ${longestCommonPrefix(arrayOf("flower", "flow", "floor"))}")

    println("Longest Common Prefix is : ${longestCommonPrefix(arrayOf("flower", "flow", "f"))}")

    println("Longest Common Prefix is : ${longestCommonPrefix(arrayOf("c", "acc", "ccc"))}")

    println("Longest Common Prefix is : ${longestCommonPrefix(arrayOf("dog", "racecar", "car"))}")
}
