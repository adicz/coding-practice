package leetcode;

/**
 * @link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * @difficulty: EASY
 */
public class T121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int result = 0;
        int minBuy = prices[0];
        for (int i = 0; i < prices.length; i++) {
           minBuy = Math.min(minBuy, prices[i]);
           result = Math.max(prices[i] - minBuy, result);
        }
        return result;
    }
}
