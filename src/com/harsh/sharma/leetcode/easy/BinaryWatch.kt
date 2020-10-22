package com.harsh.sharma.leetcode.easy

import kotlin.math.min
import kotlin.math.pow

/*

    401. Binary Watch

    https://leetcode.com/problems/binary-watch/

 */

fun readBinaryWatch(num: Int): List<String> {
    val ret = arrayListOf<String>()
    val maxHourLight = min(num, 3)
    for (hour in 0..maxHourLight) {
        if (num - hour > 5) {
            continue
        }
        val minute = num - hour
        val hours = getTimeComposite(hour, 4, 11, false)
        val miuntes = getTimeComposite(minute, 6, 59, true)
        for (h in hours) {
            for (m in miuntes) {
                ret.add("$h:$m")
            }
        }
    }
    return ret
}

fun calNum(flag: IntArray): Int {
    var ret = 0
    for (i in 0 until flag.size) {
        if (flag[i] == 0) {
            continue
        }
        ret += 2.0.pow(i).toInt()
    }
    return ret
}


fun getTimeComposite(lights: Int, led: Int, max: Int, twoDigit: Boolean): List<String> {
    if (lights == 0) {
        return arrayListOf(if (twoDigit) "00" else "0")
    }

    val flag = IntArray(led)
    val ret = arrayListOf<String>()
    fun dfs(lights: Int, flag: IntArray, offset: Int) {
        if (lights == 0) {
            val calNum = calNum(flag)
            var str = calNum.toString()
            if (twoDigit && calNum < 10) {
                str = "0$str"
            }
            ret.add(str)
            return
        }
        for (i in offset until led) {
            flag[i] = 1
            val hour = calNum(flag)
            if (hour > max) {
                flag[i] = 0
                continue
            }
            dfs(lights - 1, flag, i + 1)
            flag[i] = 0
        }
    }
    dfs(lights, flag, 0)
    return ret
}
