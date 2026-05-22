class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        
        TreeSet<Integer> set = new TreeSet<>();
    
        for(int num: nums){
           
            set.add(num);
          
        }
         int i=1;
        while(i<=n){
            if(!set.contains(i)){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}