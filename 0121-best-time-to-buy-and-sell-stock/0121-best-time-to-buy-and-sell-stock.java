class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 0;
        int max = 0;

        for(sell = 0; sell < prices.length; sell++){
            if(prices[sell] < prices[buy]){
                buy = sell;
            }
            else{
                int profit = prices[sell] - prices[buy];
                if(profit > max)
                    max = profit;
            }
        }
        return max;                
    }
}