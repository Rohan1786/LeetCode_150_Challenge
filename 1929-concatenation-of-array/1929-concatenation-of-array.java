class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n+n];
        int k=0;
        for(int num: nums){
   ans[k++]=num;
        }
        for(int num: nums){
            ans[k++]=num;
        }
        return ans;
    }
}