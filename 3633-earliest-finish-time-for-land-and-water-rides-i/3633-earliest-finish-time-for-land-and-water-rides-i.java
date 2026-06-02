class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int landFinish = landStartTime[i]+landDuration[i];
                int waterStart=Math.max(waterStartTime[j],landFinish);
                int total=waterStart+waterDuration[j];
                //ok i need think ......
                //Now i think it will works
                int waterFinish=waterStartTime[j]+waterDuration[j];
                int landStart=Math.max(landStartTime[i],waterFinish);
                int total1=landStart+landDuration[i];
                int currentMin=Math.min(total1,total);
                if(currentMin<min){
                    min=currentMin;
                }
            }
        }
        return min;
    }
}