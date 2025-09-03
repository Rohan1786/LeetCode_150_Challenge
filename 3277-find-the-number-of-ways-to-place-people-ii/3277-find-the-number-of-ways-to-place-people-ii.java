class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points,(a,b)-> a[0] == b[0]?Integer.compare(b[1],a[1]):Integer.compare(a[0],b[0]));
        int n = points.length;
        int cnt =0;
        for(int i=0; i<n; i++){
            int maxY = Integer.MIN_VALUE;
            for(int j = i+1; j<n; j++){

                if(points[i][1]>=points[j][1] && points[j][1]>maxY){
                    maxY = points[j][1];
                 cnt++;
                }
            }
        }
        return cnt;
    }
}