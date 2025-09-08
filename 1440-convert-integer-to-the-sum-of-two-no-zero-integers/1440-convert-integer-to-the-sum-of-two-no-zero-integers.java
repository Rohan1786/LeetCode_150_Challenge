class Solution {
    public boolean hasZero(int n){
        while(n>0){
            if(n%10==0) return true;
            n/=10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
         
        for(int i=1;i<n;i++){
            int left = i;
            int right = n-i;
           
            // if(!String.valueOf(left).contains("0") && !String.valueOf(right).contains("0")) {
            //    return new int[]{left, right};
            // }
            if(!hasZero(left) && !hasZero(right)){
                return new int[]{left, right};
            }
        }
        return new int[0];
    }
}