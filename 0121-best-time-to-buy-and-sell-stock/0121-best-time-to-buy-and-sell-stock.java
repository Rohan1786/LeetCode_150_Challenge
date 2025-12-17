class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int n = prices.length;
        int maxProfit = 0;
        for(int i=1; i<n; i++){
            int st = prices[i];
          if(buy > st){
            buy = st;
          }else{
      maxProfit  = Math.max(st-buy, maxProfit); 
     }
        }
        return maxProfit;
    }
}