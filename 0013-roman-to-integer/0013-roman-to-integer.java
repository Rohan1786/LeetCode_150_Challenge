class Solution {
    public int getValue(char c){
        switch(c){ 
            case 'I': return 1;
            
            case 'V': return 5;
            
            case 'X': return 10;
            
            case 'L': return 50;
            
            case 'C': return 100;
            
            case 'D': return 500;
            
            case 'M': return 1000;
            
            default: return 0;
        }
    }
    public int romanToInt(String s) {

      int prev =0;
      int total =0;
      int n = s.length();
      for(int i = n-1; i >=0; i--) {
        int curr = getValue(s.charAt(i));
        if(curr<prev){
            total-=curr;
        }
        else
        {
      total+=curr;
        }
        prev = curr;
      }
      return total;

        // Time complexity is very high
        // char[] roman = {'I','V','X','L','C','D','M'};
        // int[] num={1, 5, 10, 50, 100, 500,1000};
        // int total = 0;
        // int j = 0;
        // int current =0;
        // int n = roman.length;
        // int stringSize = s.length();
        // for(int i=0;i<n;i++){
        //     for(int k = 0;k<n;k++){
        //         while(j<stringSize){
        //          if(s.charAt(j)==roman[k]){
        //           j++;
        //           current = num[k];
        //           total-=current;
        //      }
             
        //      else{
        //         total+=current;
        //      }
        //      }
        //     }
           
        // }
        // return total;
    }
}