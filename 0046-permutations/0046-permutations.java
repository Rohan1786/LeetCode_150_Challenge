class Solution {
    public void helper(int[] nums, int idx, List<List<Integer>> list) {
        int n = nums.length;
        if(idx==n-1){
            List<Integer> ll = new ArrayList<>();
            for(int i=0;i<n; i++){
                ll.add(nums[i]);
            } 
            list.add(ll);
            return;
        }
        for(int i=idx; i<n; i++){
           swap(i, idx, nums);
           helper(nums, idx+1,list);
           swap(i, idx, nums);
        }
         
    }
    public void swap(int i, int idx, int[] nums)
    {
        int temp = nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        helper(nums, 0, arr);
        return arr;
    }
}