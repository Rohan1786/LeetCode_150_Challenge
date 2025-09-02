class Solution {
    public int numberOfPairs(int[][] points) {
        int m =points.length;
        int n =points.length;
        Arrays.sort(points,(a,b)->a[0]==b[0]?Integer.compare(b[1], a[1]):Integer.compare(a[0],b[0]));
        int count=0;
        for(int i=0; i<points.length; i++){
            int minY = Integer.MIN_VALUE;
            for(int j=i+1; j<points.length; j++)
            {
                if(points[i][1]>=points[j][1] && points[j][1]>minY){
                    count++;
                    minY = points[j][1];
                }            }
        }
        return count;
    }
}