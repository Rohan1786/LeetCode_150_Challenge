class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int n= nums.length;
        // int size=n-k;
        // int[]arr = new int[size+1];

        // int left =0;
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        // for(int right=0; right<n; right++){
            
        //      pq.offer(nums[right]);
        //       if(pq.size()>=k){
                
        //         arr[left]=pq.peek();
        //       pq.remove(nums[left]);
        //       left++;
        //      }  
        // }
        // return arr;
        int n=nums.length;
        int size=n-k+1;
        int[] ans =new int[size];
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<n; i++){
            while(!dq.isEmpty() && dq.peek()<i-k+1){
                dq.poll();
            
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offer(i);

            if(i>=k-1){
                ans[i-k+1]=nums[dq.peek()];
            }

        }
        return ans;
    }
}