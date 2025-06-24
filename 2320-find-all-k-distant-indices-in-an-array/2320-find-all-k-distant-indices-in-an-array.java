class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
    //    i will go with approach what problem understand by me
    int n = nums.length;
    List<Integer> ans = new ArrayList<>();
   
    int rightSideMax = 0;
    for(int j = 0;j<n;j++){
        if(nums[j]==key){
            int leftSideMin= Math.max(j-k,rightSideMax);
            rightSideMax = Math.min(j+k,n-1)+1;
           
             for(int i = leftSideMin;i<rightSideMax;i++){
            ans.add(i);
        }
        }
       
    }
    return ans;
    }
}