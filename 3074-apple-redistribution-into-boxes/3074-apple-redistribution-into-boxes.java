class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        int sum = Arrays.stream(apple).sum();
for(int cap: capacity){
      heap.offer(cap);
}
int cnt =0;
int max =0;
while(!heap.isEmpty()){
       max+=heap.poll();
        cnt++;
       if(max>=sum) break;
      
}
return cnt;
    }
}