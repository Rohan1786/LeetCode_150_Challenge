class Solution {
    public boolean isBalanced(int num) {
        int[] field = new int[10];
        while(num!=0){
       int digit= num%10;
       field[digit]++;
       num/=10;
        }
        for(int digit=0; digit<10; digit++){
        if(field[digit]!=0 && field[digit]!=digit){
            return false;
        }
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        for(int num=n+1; num<=1224444; num++){
            if(isBalanced(num)){
                return num;
            }
        }
        return -1;
    }
}