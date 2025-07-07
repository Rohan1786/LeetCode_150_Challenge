import java.util.*;

class Solution {
    public int maxEvents(int[][] events) {
        // Sort events by start time
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        // Min-heap to store end times of available events
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int i = 0, n = events.length, attended = 0;
        int day = 1;

        // Find the last possible day we may attend an event
        int lastDay = 0;
        for (int[] event : events) {
            lastDay = Math.max(lastDay, event[1]);
        }

        // Simulate each day from day 1 to lastDay
        while (day <= lastDay) {

            // Add events that start today
            while (i < n && events[i][0] == day) {
                minHeap.offer(events[i][1]);
                i++;
            }

            // Remove expired events
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            // Attend one event (the one that ends earliest)
            if (!minHeap.isEmpty()) {
                minHeap.poll();
                attended++;
            }

            day++;
        }

        return attended;
    }
}
