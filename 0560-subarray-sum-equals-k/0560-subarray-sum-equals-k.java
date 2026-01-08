class Solution {
    public int subarraySum(int[] nums, int k) {
    //     int cnt=0;
    //    for(int i=0; i<nums.length; i++){
    //     int value = nums[i];
    //     if(value==k){
    //         cnt++;
    //     }
    //     for(int j=i+1; j<nums.length; j++){ 
    //          value+=nums[j];
    //         if(k==value){
    //             cnt++;
    //         }
           
    //     }
    //    }
    //     return cnt;



    //NOw as par the hashMap we can able to find out the subarray sub easily
    Map<Integer, Integer> map = new HashMap<>();
   int sum =0;
   int count=0;
   map.put(0, 1);
   for(int num: nums){
    sum+=num;
    if(map.containsKey(sum-k)){
        count+=map.get(sum-k);
    }
   
        map.put(sum, map.getOrDefault(sum, 0)+1);
     
   }
   return count;
    }
}