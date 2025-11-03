class Solution {
    
    public int minCost(String colors, int[] neededTime) {
    int n = colors.length();
    int time = Integer.MAX_VALUE;
    int totalTime =0;
    int maxTime=neededTime[0];
    for(int right=1; right<n; right++){
        if(colors.charAt(right)==colors.charAt(right-1)){
         totalTime += Math.min(maxTime, neededTime[right]);
         maxTime = Math.max(maxTime, neededTime[right]);
        } else{
            maxTime = neededTime[right];
        }
    }
    return totalTime;
    }
}