package com.harsh.sharma.leetcode.easy

/*
    121. Best Time to Buy and Sell Stock

    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

 */

fun maxProfitBruteForce(prices: IntArray): Int {
    var maxProfit = 0
    for (i in 0 until prices.size - 1) {
        for (j in i + 1 until prices.size) {
            val profit = prices[j] - prices[i]
            if (profit > maxProfit) maxProfit = profit
        }
    }
    return maxProfit
}

fun maxProfitOnePass(prices: IntArray): Int {
    var minPrice = Int.MAX_VALUE
    var maxProfit = 0
    for (i in prices.indices) {
        if (prices[i] < minPrice) minPrice =
            prices[i] else if (prices[i] - minPrice > maxProfit) maxProfit = prices[i] - minPrice
    }
    return maxProfit
}

fun main() {
    println(maxProfitOnePass(intArrayOf(7,1,5,3,6,4)))
    println(maxProfitOnePass(intArrayOf(7,6,4,3,1)))
}