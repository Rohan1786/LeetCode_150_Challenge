
class Solution {
    public int check(int n,int[] memo){
        if(n<=1){
            return n;
        }
        if(memo[n]!=-1){
            return memo[n];
        }
        memo[n]=check(n-1,memo)+check(n-2,memo);
        return memo[n];
    }
    public int fib(int n) {
        int[] memo = new int [n+1];
        Arrays.fill(memo,-1);
        return  check(n,memo);

    }
}