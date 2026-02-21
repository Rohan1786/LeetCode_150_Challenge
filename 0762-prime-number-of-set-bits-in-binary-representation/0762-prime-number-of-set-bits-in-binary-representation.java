class Solution {
    public boolean check(String str) {
        int ones=0;
        for(char ch: str.toCharArray()){
      if(ch=='1'){
        ones++;
      }}
      if (ones < 2) return false; 
      for(int j=2; j<=Math.sqrt(ones); j++){
        if(ones%j==0){
            return false;
        }
      }
      
        
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count =0;
        for(int k = left; k<=right; k++){
                String num = Integer.toBinaryString(k);
                if(check(num)){
                    count++;
                }
        }
        return count;
    }
}