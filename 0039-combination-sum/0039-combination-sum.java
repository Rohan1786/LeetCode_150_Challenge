class Solution {
    public void backTrack(List<List<Integer>>res, int sum, List<Integer>curr, int[] nums, int target, int start){
    if(sum==target){
        res.add(new ArrayList<>(curr));
        return;
    } else if(sum>target){
        return;
    }
    for(int i=start; i<nums.length; i++){
        curr.add(nums[i]);
        backTrack(res, sum+nums[i], curr, nums, target, i);
        curr.remove(curr.size()-1);
    }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, 0, new ArrayList<>(), candidates, target, 0);
        return res;
    }
}