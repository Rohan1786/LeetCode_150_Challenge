class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right= numbers.length-1;
        int sum = 0;
        while(left<right){
         if(numbers[left]+numbers[right]>target){
             right = right -1;
         }else if(numbers[left]+numbers[right]<target){
              left = left+1;
         }  else{
            return new int[]{left+1, right+1};
         }     
            }
    
        // int n = numbers.length;
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<n; i++){
        //     if(map.containsKey(target-numbers[i])){
        //         return new int[]{map.get(target-numbers[i])+1, i+1};
        //     }
        //     map.put(numbers[i], i);
        // }
       return new int[]{};
    }
}