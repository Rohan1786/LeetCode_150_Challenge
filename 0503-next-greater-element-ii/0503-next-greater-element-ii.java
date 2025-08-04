class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer>stack= new Stack<>();
       
        int[]res=new int[n];
        for(int i=2*n-1; i>=0; i--)
        {
            int current = nums[i%n];
           while(!stack.isEmpty() && stack.peek()<=current){
            stack.pop();
           }
           if(i<n) res[i]=stack.isEmpty()?-1:stack.peek();
          stack.push(current);
        }
        return res;
    }
}