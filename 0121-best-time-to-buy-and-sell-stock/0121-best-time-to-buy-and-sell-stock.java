class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        int n = prices.length;
        for(int i=1; i<n; i++){
            int sell = prices[i];
            if(buy>sell){
                buy=sell;
            }
                maxProfit = Math.max(sell-buy, maxProfit);
           
        }
        return maxProfit;
    }
}