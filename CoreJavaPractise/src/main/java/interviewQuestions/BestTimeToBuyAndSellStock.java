package interviewQuestions;

/*

You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example:
---------------------------------
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

*/

public class BestTimeToBuyAndSellStock
{
    public static void main(String[] args)
    {
        int[] stockPriceOnEachDay = {2, 7, 1, 5, 3, 12, 4, 9};

        calculateMaxProfit(stockPriceOnEachDay);
    }

    private static void calculateMaxProfit(int[] stockPriceOnEachDay)
    {
        int maxProfit = 0;
        int minPriceSoFar = stockPriceOnEachDay[0];
        int sellPrice;

        for (int i = 1; i < stockPriceOnEachDay.length; i++)
        {
            minPriceSoFar = Math.min(minPriceSoFar, stockPriceOnEachDay[i]);
            sellPrice = stockPriceOnEachDay[i];
            maxProfit = Math.max(maxProfit, sellPrice - minPriceSoFar);

            System.out.println("Min price: " +minPriceSoFar + " Sell Price: " +sellPrice);
        }
        System.out.println("Max profit: " +maxProfit);
    }
}
