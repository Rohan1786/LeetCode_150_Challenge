class Solution {
    public long getDescentPeriods(int[] prices) {
       int left=0;
       int n = prices.length;
      int prev = 1;
      long res =1;
      for(int i=1; i<n; ++i)
      {
        if(prices[i]==prices[i-1]-1){
            ++prev;
        }
        else{
            prev=1;
        }
        res+=prev;
      }
      return res;
    }
}