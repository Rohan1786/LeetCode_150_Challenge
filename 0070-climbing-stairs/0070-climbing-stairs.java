class Solution {
    int[] memo;
    public int climbStairs(int n) {
    //     memo = new int[n+1];
    //    Arrays.fill(memo, -1);
       //now its time to make bottom up approach
       if(n==0||n==1) return 1;
       int[] bottom = new int[n+1];
       bottom[0]=1;
       bottom[1]=1;
       for(int i=2; i<=n; i++){
        //0 1 2 
        bottom[i]=bottom[i-1]+bottom[i-2];
       }
       //return memo[n];
       return bottom[n];
    }
//     public int climb(int n){
//  if(n==0||n==1) return 1;
//         if(memo[n]!=-1) return memo[n];
//       return memo[n]=climb(n-1)+climb(n-2);
//     }
}