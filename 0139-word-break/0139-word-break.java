class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0]=true;
        Set<String> set = new HashSet<>(wordDict);
        int maxLen = 0;
        for(String name: wordDict) {
            maxLen = Math.max(name.length(), maxLen);
        }
        for(int i=1; i<=n; i++){
            for(int j=i-1; j>=Math.max(0,i-maxLen);j--){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                }
            }
        }
        return dp[n];
    }
}