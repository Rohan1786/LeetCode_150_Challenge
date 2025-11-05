class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
   PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            pq.add(new int[]{nums[i], i});

            // Remove elements that are outside the window
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }

            // Once we have the first full window, start recording results
            if (i >= k - 1) {
                res[idx++] = pq.peek()[0];
            }
        }

        return res;
    }
}