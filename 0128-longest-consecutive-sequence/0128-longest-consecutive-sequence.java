class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxLen =1;
      if(nums.length==0) return 0;
     
        for(int num: set){
           
            if(set.contains(num-1))continue;
            else{
                 int currNum = num;
                  int curr =1;
                while(set.contains(currNum+1)){
                  currNum++;
                  curr++;
            }
             maxLen=Math.max(curr, maxLen);
            }
           
        }
        return maxLen;
    }
}