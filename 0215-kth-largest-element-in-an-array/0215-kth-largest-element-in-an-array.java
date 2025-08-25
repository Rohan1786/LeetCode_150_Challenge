class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];

        //now using heap 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: nums){
            pq.offer(num);
            if(pq.size()>k){
            pq.poll();
            }
        }
        return pq.poll();
    }
}