class Solution {
    
    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int smallest = 0;
        int cnt = 0;
        int bits = (int)(Math.log(k)/Math.log(2))+1;
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(n-1-i);
            if(ch=='1'){
                if(i<bits && smallest+(1<<i)<=k){
                    smallest+=1<<i;
                    cnt++;
                }
            }
            else{
                cnt++;
            }
        }
       return cnt;
    }
}