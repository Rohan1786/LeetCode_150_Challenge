class Solution {
    public int findClosest(int x, int y, int z) {
        int v1 = Math.abs(x-z);
        int v2 = Math.abs(y-z);
        if(v1<v2){
            return 1;
        }
        else if(v1==v2){
            return 0;
        }
        else{
            return 2;
        }
    }
}