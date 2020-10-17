package com.harsh.sharma.leetcode.easy

/*

    374. Guess Number Higher or Lower

    https://leetcode.com/problems/guess-number-higher-or-lower/

 */

abstract class GuessGame {

    fun guess(num: Int): Int = when {
        num > 3 -> -1
        num < 3 -> 1
        else -> 0
    }

    abstract fun guessNumber(n: Int): Int
}

class GuessGameSolutionOne : GuessGame() {

    override fun guessNumber(n: Int): Int {
        for (i in 1 until n) if (guess(i) == 0) return i
        return n
    }
}

class GuessGameSolutionTwo : GuessGame() {

    override fun guessNumber(n: Int): Int {
        var low = 1
        var high = n
        while (low <= high) {
            val mid = low + (high - low) / 2
            val res: Int = guess(mid)
            if (res == 0) return mid else if (res < 0) high = mid - 1 else low = mid + 1
        }
        return -1
    }

}

class GuessGameSolutionThree : GuessGame() {

    override fun guessNumber(n: Int): Int {
        var low = 1
        var high = n
        while (low <= high) {
            val mid1 = low + (high - low) / 3
            val mid2 = high - (high - low) / 3
            val res1: Int = guess(mid1)
            val res2: Int = guess(mid2)
            if (res1 == 0) return mid1
            if (res2 == 0) return mid2 else if (res1 < 0) high = mid1 - 1 else if (res2 > 0) low = mid2 + 1 else {
                low = mid1 + 1
                high = mid2 - 1
            }
        }
        return -1
    }
}

