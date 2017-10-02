package leetcode;

public class BuyAndSellBlockWithCoolDown {

public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        if(prices.length == 1) return 0;
        int[] buy = new int[prices.length];
        int[] sell = new int[prices.length];
        buy[0] = -prices[0];buy[1] = -Math.min(prices[0], prices[1]);
        sell[0] = 0;
        for(int i=0;i<prices.length;i++){
        	int price = prices[i];
        	if(i>=2) buy[i] = Math.max(sell[i-2]-price, buy[i-1]);
        	if(i>=1) sell[i] = Math.max(sell[i-1], buy[i-1]+price);
        }
        return sell[prices.length-1];
    }
}
