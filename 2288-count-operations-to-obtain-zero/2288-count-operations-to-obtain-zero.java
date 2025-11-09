class Solution {
    
    public int countOperations(int num1, int num2) {
        int steps=0;
        while(num1!=0 && num2!=0){
            if(num1<num2){
                num2-=num1;
            }
            else{
                num1-=num2;
            }
            steps++;
        }
        return steps;
    }
}