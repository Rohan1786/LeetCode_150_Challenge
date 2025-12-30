class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank =0;
        int tank =0;
        int startIndex=0;
        int totalGas=0;
        int totalCost=0;
        for(int i=0; i<gas.length; i++){
            totalCost+=cost[i];
            totalGas+=gas[i];
            tank+=gas[i]-cost[i];
            if(tank<0){
                startIndex=i+1;
                tank =0;
            }
        }
        return totalCost>totalGas?-1:startIndex;
    }
}