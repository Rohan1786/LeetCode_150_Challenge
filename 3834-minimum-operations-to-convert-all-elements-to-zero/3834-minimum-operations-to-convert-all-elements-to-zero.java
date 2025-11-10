class Solution {
    public int minOperations(int[] nums) {
        int ops=0;
        Stack<Integer> stack= new Stack<>();
        for(int i=0; i<nums.length; i++){
          while(!stack.isEmpty() && stack.peek()>nums[i]) {
            stack.pop();
          }
          if(nums[i]==0) continue;
          if(stack.isEmpty()||stack.peek()<nums[i]){
               stack.push(nums[i]);
               ops++;
          }
         }
         return ops;
    }
}