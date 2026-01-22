class Solution {
    int[] memo;
    public int decodeWays(String digits, int index){
        int n = digits.length();
        if(index>=n)
        {
            return 1;
        }
        if(memo[index]!=-1) {
            return memo[index];
        }
        int ways=0;
        
            if(digits.charAt(index)!='0'){
               ways=decodeWays(digits, index+1);
            
        }
    if((index+1<n) && ((digits.charAt(index)=='1' && digits.charAt(index+1)<='9')|| (digits.charAt(index)=='2' && digits.charAt(index+1)<='6'))){
        ways+=decodeWays(digits, index+2);
     }
     return memo[index]=ways;
    }
    public int numDecodings(String s) {
        memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return decodeWays(s, 0);
    }
}