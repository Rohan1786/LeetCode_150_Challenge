class Solution {
    public int[] productExceptSelf(int[] nums) {
    
    //     int n = nums.length;
    //     int p =1;
    //     int[] product = new int[n];
    //    for(int i = 0; i< n; i++){
        
    //     int j = i+1;
    //     while((j%n)!=i){
    //      p*=nums[j%n];
    //      j++;
    //     }
    //    product[i] = p;
    //    p = 1;
    //    }
    //    return product;

    //  above code is not for large input lets optimize this code
   
    int n = nums.length;
    int [] product = new int[n];
    product[0]=1;
   for(int i =1;i<n;i++){
       product[i]=product[i-1]*nums[i-1];
   }
   int suffix =1;
   for(int i=n-1;i>=0;i--){
    product[i]*=suffix;
    suffix*=nums[i];
   }
   return product;
    }
}