class Solution {
    public int maxTwoEvents(int[][] events) { 
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0])); 
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[1], b[1])
        );

        int maxValueSoFar = 0;
        int answer = 0;

        for (int[] e : events) {
            int start = e[0];
            int end = e[1];
            int value = e[2];
 
            while (!pq.isEmpty() && pq.peek()[1] < start) {
                maxValueSoFar = Math.max(maxValueSoFar, pq.poll()[2]);
            } 
            answer = Math.max(answer, maxValueSoFar + value); 
            pq.offer(e);
        }

        return answer;
    }
}
