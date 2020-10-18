package com.harsh.sharma.leetcode.easy

/*

    383. Ransom Note

    https://leetcode.com/problems/ransom-note/

 */

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    if (ransomNote.isEmpty()) return true
    if (magazine.isEmpty()) return false

    val ransomNoteMap = hashMapOf<Char, Int>()
    val magazineMap = hashMapOf<Char, Int>()
    ransomNote.forEach { index -> ransomNoteMap[index] = ransomNoteMap[index]?.plus(1) ?: 1 }
    magazine.forEach { index -> magazineMap[index] = magazineMap[index]?.plus(1) ?: 1 }

    ransomNoteMap.entries.forEach { it ->
        val key = it.key
        val count = magazineMap[key]
        if (count == null || count < it.value) {
            return false
        }
    }
    return true
}

fun main() {
    println(canConstruct("a","b"))
    println(canConstruct("aa","ab"))
    println(canConstruct("aa","aab"))
}