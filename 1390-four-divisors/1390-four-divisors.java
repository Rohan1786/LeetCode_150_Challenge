class Solution {
    public int check(int num){
        int sum =0;
        int cnt =0;
        for(int i=1; i*i<=num; i++){
            if(num%i==0){
                sum+=i;
                cnt++;
                if(i!=num/i){
                    sum+=(num/i);
                    cnt++;
                }
                 
            }
        }
        return cnt==4?sum:0;
    }
    public int sumFourDivisors(int[] nums) {
        
        int max =0;
        for(int num: nums){
        //    int curr[] = check(num);
        //    int count = curr[1];
        //    int sum = curr[0];
         int sum = check(num); 
         
            max+=sum;
           
        }
        return max;
    }
}