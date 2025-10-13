class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        int occ = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int right =0; right<nums.length; right++){
          int num = nums[right];
          while(set.contains(num)){
           set.remove(nums[left]);
           occ=Math.abs(left-right);
           if(occ<=k){
            return true;
           }
           left++;
          }  
          set.add(num);
        }
        return false;
    }
}