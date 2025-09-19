class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
            set.add(nums[i]);}
        }
    int []res= new int[set.size()];
    int i=0;
    for(int num: set){
        res[i++]=num;
    }
    return res[0];
    }
}