package com.harsh.sharma.leetcode.easy

/*

    278. First Bad Version

    https://leetcode.com/problems/first-bad-version/

 */



/**

/* The isBadVersion API is defined in the parent class VersionControl.
def isBadVersion(version: Int): Boolean = {} */

 */

abstract class VersionControl {
    var badVersion: Int = 0

    fun isBadVersion(version: Int): Boolean {
        return version >= badVersion
    }

    abstract fun firstBadVersion(n: Int): Int
}

class FirstBadVersion : VersionControl() {

    // Binary Search
    override fun firstBadVersion(n: Int): Int {
        var left = 1
        var right = n
        while (left < right) {
            val mid = left + (right - left) / 2
            if (isBadVersion(mid)) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }

    // Linear Scan
/*
    override fun firstBadVersion(n: Int): Int {
        for (i in 1 until n) {
            if (isBadVersion(i)) {
                return i
            }
        }
        return n
    }
*/
}