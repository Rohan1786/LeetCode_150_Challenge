class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        int repeat = n/2;
        int max=0;;
    Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;

    }  
}