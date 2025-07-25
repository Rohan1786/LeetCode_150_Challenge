class Solution {
    public int maxSum(int[] nums) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
       for(int num: nums){
        if(!set1.contains(num) && num>0){
            set1.add(num);
        }
        if(!set2.contains(num) && num<=0){
            set2.add(num);
        }
       }
       int size1 = set1.size();
       int size2 = set2.size();
       int max=Integer.MIN_VALUE;
int sum=0;
     if(size1==0){
         for(int num:set2)
         {
            max=Math.max(max,num);
         }
         return max;
     }else{
        for(int num:set1){
            sum+=num;
        }
     }
return sum;
    }
}