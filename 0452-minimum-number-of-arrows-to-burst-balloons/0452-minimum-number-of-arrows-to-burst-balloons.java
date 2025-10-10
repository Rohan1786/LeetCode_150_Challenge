class Solution {
    public int findMinArrowShots(int[][] points) {
        int count =1;
    Arrays.sort(points,(a, b)->Integer.compare(a[0],b[0]));
    int prevStart=points[0][0];
    int prevEnd = points[0][1];
    for(int i=1; i<points.length; i++) {
        int currStart = points[i][0];
        int currEnd = points[i][1];
        if(currStart>prevEnd){
            //no overlap
            count++;
           prevStart = currStart;
           prevEnd = currEnd;
        } else{
            //ovelap we need to find currect one
            prevStart = Math.max(currStart, prevStart);
            prevEnd = Math.min(currEnd, prevEnd);
        }
    }
    return count;
    }
}