package dev.wfuertes.arrays;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1458719191/
 * 
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you
 * cannot achieve any profit, return 0.
 * 
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
 * 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you
 * must buy before you sell.
 * 
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * 
 * Constraints:
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 */
public class BestTimeToBuyAndSellStock {

    // O(n^2)
    public int maxProfitOn2(int[] prices) {
        var maxProfit = 0;

        for (var i = 0; i < prices.length - 1; i++) {
            for (var j = i + 1; j < prices.length; j++) {
                var sellPrice = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, sellPrice);        
            }
        }

        return maxProfit;
    }

    // O(n)
    public int maxProfit(int[] prices) {
        var minPrice = Integer.MAX_VALUE;
        var maxProfit = 0;

        for (var price : prices) {
            minPrice = Math.min(price, minPrice);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}
