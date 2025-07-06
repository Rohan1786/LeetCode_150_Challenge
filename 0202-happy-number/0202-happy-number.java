class Solution {
   public int getSquare(int n){
    int sum =0;
    while(n!=0){
        int digit = n % 10;
        sum+=(digit*digit);
        n/=10;
    }
    return sum;
   }
    public boolean isHappy(int n) {
        
        Set<Integer>map = new HashSet<>();
        while(n!=1){
            if(map.contains(n)) return false;
            map.add(n);
            n= getSquare(n);
        }
        return true;
    }
}