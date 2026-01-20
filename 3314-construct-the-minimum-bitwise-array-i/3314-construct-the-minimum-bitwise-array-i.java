class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            int x = nums.get(i);
            int ans = -1;
            int d=1;
            while((x & d)!=0){
                ans=x-d;
                d<<=1;
            }
            res[i]=ans;
        }
        return res;
    }
}