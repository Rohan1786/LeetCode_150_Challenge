class Solution {
    public int totalFruit(int[] fruits) {
        int n =fruits.length;
        int left =0;
        int right =0;
        Map<Integer,Integer> map = new HashMap<>();  // to count calculations
        int count = 0;
        while(right < n){
         map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
         if(map.size()>2) {
            map.put(fruits[left],map.get(fruits[left])-1); //count activity will be free for another unique value 
            if(map.get(fruits[left])==0){
                map.remove(fruits[left]);//based on count it will removed
            }
            left++;
         }
         count=Math.max(count,right-left+1);
         right++;
        }
        return count;
    }
}