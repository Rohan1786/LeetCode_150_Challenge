class Solution {
    public int bestClosingTime(String customers) {
        int minPenalty =0;
        int prefix =0;
        int bestTime =0;
        int n = customers.length();
        for(int i=0; i<n; i++){
       char ch= customers.charAt(i);
       prefix+=ch=='Y'?-1:1;
       if(prefix<minPenalty){
        bestTime = i+1;
        minPenalty = prefix;
       }
        } 
        return bestTime;
    }
}