class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[]dist= new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k-1]=0;
        for(int i=0; i<n-1; i++) {
            for(int[] e: times){
            int u = e[0]-1;
            int v = e[1]-1;
            int wt = e[2];
           if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]) {
            dist[v]=dist[u]+wt;
           }
            }
        }
        int max =0;
        for(int num: dist) {
            if(num==Integer.MAX_VALUE) return -1;
            max=Math.max(max, num);
        }
        return max;
    }
}