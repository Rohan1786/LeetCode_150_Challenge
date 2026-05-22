class Solution {
    public int search(int[] nums, int target) {
        int nm = 0;
        int n = nums.length;
        for(int i=0; i<n-1; i++){
           if(nums[i]>nums[i+1]){
            nm = i+1;
            break;
           }
        }
        int left =0; 
        int right = nm;

        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right = mid-1;
            }
            
        }
        left = nm;
        right = n-1;
         while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right = mid-1;
            }
            
        }

     return -1;
    }
}