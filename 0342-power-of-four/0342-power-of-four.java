class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        double res = Math.log(n) / Math.log(4);
        
         return Math.abs(res - Math.round(res)) < 1e-9;
    }
}