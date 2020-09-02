package com.harsh.sharma.leetcode.easy

/*

    13. Roman to Integer

    https://leetcode.com/problems/roman-to-integer/

 */

fun romanToInt(s: String): Int {
    var map = HashMap<Char, Int>()
    map.put('I', 1)
    map.put('V', 5)
    map.put('X', 10)
    map.put('L', 50)
    map.put('C', 100)
    map.put('D', 500)
    map.put('M', 1000)
    var res = 0
    for (i in s.indices) {
        val c = s.get(i)
        if ((
                    (c == 'I' || c == 'X' || c == 'C') &&
                            i + 1 < s.length &&
                            map.get(s.get(i + 1))!! > map.get(c)!!
                    ))

            res -= map.get(c)!!
        else
            res += map.get(c)!!
    }
    return res
}

fun main() {
    println("III = ${romanToInt("III")}")

    println("IV = ${romanToInt("IV")}")

    println("IX = ${romanToInt("LVIII")}")

    println("MCMXCIV = ${romanToInt("MCMXCIV")}")
}
