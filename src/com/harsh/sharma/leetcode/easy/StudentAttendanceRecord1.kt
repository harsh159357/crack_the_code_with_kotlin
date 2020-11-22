package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    551. Student Attendance Record I

    https://leetcode.com/problems/student-attendance-record-i/

 */

fun checkRecord(s: String): Boolean {
    if (s.count { it == 'A' } > 1) {
        return false
    } else if (s.indexOf("LLL") != -1) {
        return false
    }
    return true
}

fun main() {
    checkRecord("PPALLP").printAndNewLine()
    checkRecord("PPALLL").printAndNewLine()
}