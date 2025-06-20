class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int call = prices[0];
        int res = 0;
        for(int i = 1; i < n; i++){
            if(call<prices[i]){
            res = Math.max(res, Math.abs(call - prices[i]));
            }
            else{
                call = prices[i];
            }
        }
        return res;
    }
}