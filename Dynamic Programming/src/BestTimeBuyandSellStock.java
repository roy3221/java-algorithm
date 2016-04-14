
public class BestTimeBuyandSellStock {
	public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int maxEndHere = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxEndHere = Math.max(0, maxEndHere += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        return maxSoFar;
    }

}
