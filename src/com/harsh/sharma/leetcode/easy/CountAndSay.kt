package com.harsh.sharma.leetcode.easy

import kotlin.random.Random
import kotlin.random.nextInt

/*

    38. Count and Say

    https://leetcode.com/problems/count-and-say/

 */

class CountAndSay {

    fun countAndSay(n: Int): String {
        var curr = StringBuilder("1")
        var prev: StringBuilder
        var count: Int
        var say: Char
        for (i in 1 until n) {
            prev = curr
            curr = StringBuilder()
            count = 1
            say = prev[0]
            var j = 1
            val len = prev.length
            while (j < len) {
                if (prev[j] != say) {
                    curr.append(count).append(say)
                    count = 1
                    say = prev[j]
                } else count++
                j++
            }
            curr.append(count).append(say)
        }
        return curr.toString()
    }

    fun main() {
        for (i in 0..5) {
            val randomInput = Random.nextInt(1..30)
            println("Random Input:\t$randomInput\nOutput:\t${countAndSay(randomInput)}\n")
        }
    }

}