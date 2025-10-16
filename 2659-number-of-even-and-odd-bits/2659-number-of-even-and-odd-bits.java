class Solution {
    public int[] evenOddBit(int n) {
        String binary = Integer.toBinaryString(n);
        String binaryString = Integer.toString(n,2);
       StringBuilder result =new StringBuilder(binaryString).reverse();
       String res = result.toString();
       int evenCount =0;
       int oddCount=0;
       for(int i=0; i<res.length(); i++){
   if(i%2==0){
    if(res.charAt(i)=='1')
    {
        evenCount++;
    } 
   }
   else{
    if(res.charAt(i)=='1'){
        oddCount++;
    }
   }
       }
       return new int[]{evenCount, oddCount};
    }
}