class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates);
      List<List<Integer>> res = new ArrayList<>();
      List<Integer> arr = new ArrayList<>();
      backTrack(res, arr, target, candidates, 0);
      return res;
    }
    public void backTrack(List<List<Integer>> res, List<Integer> arr, int target,int[] nums, int index){
        if(target==0){
            res.add(new ArrayList<>(arr));
            return;
        }
        for(int i=index; i<nums.length; i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            if(target-nums[i]<0) break;
            arr.add(nums[i]);
            backTrack(res, arr, target-nums[i], nums, i+1);
             arr.remove(arr.size()-1);
        }
    }
}