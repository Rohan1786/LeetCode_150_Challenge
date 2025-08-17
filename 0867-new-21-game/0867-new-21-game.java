class Solution {
    public double new21Game(int n, int k, int maxPts) {
        //alice 0 draws<k
        //each draw [1,maxPts] it is the integer
        //gets k or more points
        //alice gets stop k<points or more then stop
        //alice stop has n fewerr points
        //return 10^-5 of the actual anser are consider accepted
        //n =10 k =1 maxpts =10
    if (k == 0 || n >= k + maxPts - 1) return 1.0;
       double dp[] = new double[n+1];
       dp[0]=1;
       double result =0;
       double currentSum =k==0?0:1;
       for(int i=1;i<=n;i++){
        dp[i]=currentSum/maxPts;
        if(i<k){
            currentSum+=dp[i];
        }
        else{
            result+=dp[i];
        }
        if(i-maxPts>=0){
            currentSum -= dp[i-maxPts];
        }
       }
       return result;
    }
}