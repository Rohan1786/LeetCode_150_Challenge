class Solution {
    public int subArray(int index,int currOr,int[] nums,int maxOr){
        if(index==nums.length){
            if(currOr==maxOr){
                return 1;
            }
            return 0;
        }
        int takes= subArray(index+1,currOr|nums[index],nums,maxOr);
        int not=subArray(index+1,currOr,nums,maxOr);
        return takes+not;
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for(int num : nums){
            maxOr|=num;
        }
        int currOr = 0;
        
        return subArray(0,currOr,nums,maxOr);
    }
}