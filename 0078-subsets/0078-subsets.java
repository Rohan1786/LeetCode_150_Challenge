class Solution {
  public void backTrack(List<List<Integer>> res, int index, int[] nums, List<Integer> curr){
    res.add(new ArrayList<>(curr));
    for(int i=index; i<nums.length; i++){
        curr.add(nums[i]);
        backTrack(res, i+1, nums, curr);
        curr.remove(curr.size()-1);
    }
  }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int n = nums.length;

        backTrack(res, 0, nums, curr);
        return res;
    }
}