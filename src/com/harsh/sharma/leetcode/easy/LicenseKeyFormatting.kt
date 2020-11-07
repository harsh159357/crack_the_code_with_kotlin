package com.harsh.sharma.leetcode.easy

/*

    482. License Key Formatting

    https://leetcode.com/problems/license-key-formatting/

 */

fun licenseKeyFormattingOne(S: String, K: Int) = S.toUpperCase()
    .replace("-", "").reversed().withIndex().groupBy { it.index / K }
    .map { it.value.map { it.value }.joinToString("") }.joinToString("-")
    .reversed()

fun licenseKeyFormattingTwo(S: String, K: Int): String {
    var str = S.replace("-", "")
    str = str.toUpperCase()
    var g = str.length / K
    val t = g
    val sb = StringBuilder()
    val s = str.length % K
    sb.append(str.substring(0, s))
    while (g > 0) {
        if (s != 0 || g != t) {
            sb.append('-')
        }
        sb.append(str.substring(str.length - g * K, str.lastIndex - (g - 1) * K + 1))
        g--
    }
    return sb.toString()
}

fun main() {
    println(licenseKeyFormattingOne("5F3Z-2e-9-w", 4))
    println(licenseKeyFormattingOne("2-5g-3-J", 2))
}
