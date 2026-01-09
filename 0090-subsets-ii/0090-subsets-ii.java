class Solution {
 
    public void backTrack(int start, List<List<Integer>> res, List<Integer> curr, int[] nums, Set<String> set){
          String key = curr.toString();

        if (!set.contains(key)) {
            set.add(key);
            res.add(new ArrayList<>(curr));
        }
      for(int i=start; i<nums.length; i++){
        curr.add(nums[i]);
        backTrack(i+1, res, curr, nums, set);
        curr.remove(curr.size()-1);
      }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        Set<String> set = new HashSet<>();
        backTrack(0, res, new ArrayList<>(), nums, set);
        return res;
    }
}