class Solution {
    public void backTrack(List<List<Integer>>res, int sum, List<Integer>curr, int[] nums, int target, int start){
    if(sum==target){
        res.add(new ArrayList<>(curr));
        return;
    } else if(sum>target){
        return;
    }
    for(int i=start; i<nums.length; i++){
      if (i > start && nums[i] == nums[i - 1]) continue;
        curr.add(nums[i]);
        backTrack(res, sum+nums[i], curr, nums, target, i+1);
        curr.remove(curr.size()-1);
    }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> res = new ArrayList<>();
       Arrays.sort(candidates);
        backTrack(res, 0, new ArrayList<>(), candidates, target, 0);
        return res; 
    }
}