class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int total = (n * (n+1))/2;
        int sum = Arrays.stream(nums).sum();
     
        Set<Integer> set = new HashSet<>();
        int dup = 0;
        for(int num: nums){
            if(set.contains(num)){
                  dup= num;
            }
         set.add(num);
        }
        int miss = total - (sum - dup);
        return new int []{dup, miss};

    }
}