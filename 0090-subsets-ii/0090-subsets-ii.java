class Solution {
    public void backTrack(List<List<Integer>> res,   List<Integer> curr, int[] nums, int start){
        res.add(new ArrayList<>(curr));
        for(int i=start; i<nums.length; i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            backTrack(res, curr, nums, i+1);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>>res = new ArrayList<>();
         Arrays.sort(nums);
         backTrack(res, new ArrayList<>(), nums, 0);
         return res;
    }
}