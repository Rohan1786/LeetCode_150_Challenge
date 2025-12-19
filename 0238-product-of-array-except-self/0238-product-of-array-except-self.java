class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res =new int[n];
        Arrays.fill(res,1);
        int  pre =1, post=1;
        int i=0;
        while(i<n){
            res[i]=pre;
            pre=nums[i]*pre;
            i++;
        }
        i-=1;
        while(i>=0){ 
            res[i]=res[i]*post;
            post=nums[i]*post; 
            i--;
        }
        return res;
        
    }
}