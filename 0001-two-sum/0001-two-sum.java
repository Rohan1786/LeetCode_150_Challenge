class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i =0;i<nums.length;i++){
        int cp= target-nums[i];
        if(map.containsKey(cp)){
            return new int[]{map.get(cp),i};
        }
        map.put(nums[i],i);
    }
   return new int[]{};
    }
}