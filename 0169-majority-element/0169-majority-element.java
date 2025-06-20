class Solution {
    public int majorityElement(int[] nums) {
     Map<Integer,Integer> map = new HashMap<>();
     int majority = 0;
     int res = 0;
     for(int num:nums){
        map.put(num, map.getOrDefault(num,0)+1);
        if(map.get(num)>majority){
            res=num;
     majority=map.get(num);
        }

     }
return res;



        // This is code for optimizing my above code
        // Time Complexity O(n) and Space Complexity O(1)
        // int result = 0;
        // int n = nums.length;
        // int majority = 0;
        // for(int num:nums){
            
        //     if(majority==0){
        //         result = num;
        //     }
        //  majority+=num==result?1:-1;
        // }
        // return result;
    }
}