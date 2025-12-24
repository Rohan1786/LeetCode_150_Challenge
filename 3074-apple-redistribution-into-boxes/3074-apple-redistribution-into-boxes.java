class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        // PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        int sum = Arrays.stream(apple).sum();
    
int[] capacityBody = IntStream.of(capacity)
                         .boxed()
                         .sorted(Collections.reverseOrder())
                         .mapToInt(Integer::intValue)
                         .toArray();
int cnt =0;
for(int i=0; i<capacityBody.length; i++){
    if(sum<=0){
        return cnt;
    }
    cnt++;
    sum-=capacityBody[i];
}
return cnt;
// for(int cap: capacity){
//       heap.offer(cap);
// }

// int cnt =0;
// int max =0;
// while(!heap.isEmpty()){
//        max+=heap.poll();
//         cnt++;
//        if(max>=sum) break;
      
// }
// return cnt;
    }
}