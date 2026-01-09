class Solution {
    public void backTrack(List<List<Integer>> res, int[]nums, List<Integer> curr, boolean[] used){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0; i<nums.length; i++){
          if(used[i]) continue;
          used[i]=true;
          curr.add(nums[i]);
          backTrack(res, nums, curr, used);
          curr.remove(curr.size()-1);
          used[i] = false;
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, nums, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }
}