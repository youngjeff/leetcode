package BestTimetoBuyandSellStockII;

public class Main {
}
class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i+1] - prices[i] > 0)
            {
                result += prices[i+1] - prices[i];
            }
        }
            return result;
    }
}