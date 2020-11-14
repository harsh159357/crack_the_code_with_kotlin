package com.harsh.sharma.leetcode.easy

import com.harsh.sharma.leetcode.util.printAndNewLine

/*

    122. Best Time to Buy and Sell Stock II

    https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

 */
fun maxProfitRecursive(prices: IntArray): Int {
    return calculate(prices, 0)
}

fun calculate(prices: IntArray, s: Int): Int {
    if (s >= prices.size) return 0
    var max = 0
    for (start in s until prices.size) {
        var maxprofit = 0
        for (i in start + 1 until prices.size) {
            if (prices[start] < prices[i]) {
                val profit = calculate(prices, i + 1) + prices[i] - prices[start]
                if (profit > maxprofit) maxprofit = profit
            }
        }
        if (maxprofit > max) max = maxprofit
    }
    return max
}

fun maxProfitPeakValley(prices: IntArray): Int {
    var i = 0
    var valley = prices[0]
    var peak = prices[0]
    var maxProfit = 0
    while (i < prices.size - 1) {
        while (i < prices.size - 1 && prices[i] >= prices[i + 1]) i++
        valley = prices[i]
        while (i < prices.size - 1 && prices[i] <= prices[i + 1]) i++
        peak = prices[i]
        maxProfit += peak - valley
    }
    return maxProfit
}

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0
    for (i in 1 until prices.size) {
        if (prices[i] > prices[i - 1]) maxProfit += prices[i] - prices[i - 1]
    }
    return maxProfit
}

fun main() {
    maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)).printAndNewLine()
    maxProfit(intArrayOf(1, 2, 3, 4, 5)).printAndNewLine()
}