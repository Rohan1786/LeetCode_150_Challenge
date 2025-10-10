class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    Boolean[][] dp;
    int n;
    public boolean solve(int[] stones, int curr_idx, int prev) {
        if(curr_idx==n-1){
            return true;
        }
        if(dp[curr_idx][prev]!=null) return dp[curr_idx][prev];
        boolean result =false;
                for (int jump = prev - 1; jump <= prev + 1; jump++) {
            if (jump <= 0) continue;  // no backward or zero jumps

            int nextPos = stones[curr_idx] + jump; // next stone position
            if (map.containsKey(nextPos)) {
              if (solve(stones, map.get(nextPos), jump)) {
                    result = true;
                    break;
                }
            }
        }

         dp[curr_idx][prev] = result;
        return result;
    }
    public boolean canCross(int[] stones) {
        n=stones.length;
        dp= new Boolean[n][n];
   
        if(stones[1]!=1){
            return false;
        }
       for(int i=0; i<stones.length; i++) {
        map.put(stones[i], i);
       }
          return solve(stones, 0, 0);
    }
}