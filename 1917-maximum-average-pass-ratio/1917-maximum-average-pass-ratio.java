class Solution {
    public double gain(int p, int q) {
        return (double)(p + 1) / (q + 1) - (double)p / q;
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
       
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        // Step 1: Initialize heap
        for (int[] arr : classes) {
            int p = arr[0];
            int q = arr[1];
            double gain1 = gain(p, q);
            pq.offer(new double[]{gain1, p, q});
        }

        // Step 2: Assign extra students
        while (extraStudents-- > 0) {
            double[] top = pq.poll();
            int p = (int) top[1];
            int q = (int) top[2];
            p += 1;
            q += 1;
            double newGain = gain(p, q);
            pq.offer(new double[]{newGain, p, q});
        }

        // Step 3: Compute final average ratio
        double total = 0;
        while (!pq.isEmpty()) {
            double[] curr = pq.poll();
            int p = (int) curr[1];
            int q = (int) curr[2];
            total += (double)p / q;
        }

        return total / classes.length;
    }
}
