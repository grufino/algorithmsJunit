package problems;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] <= minPrice){
                minPrice = prices[i];
            } else {
                maxProfit += prices[i] - minPrice;
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
