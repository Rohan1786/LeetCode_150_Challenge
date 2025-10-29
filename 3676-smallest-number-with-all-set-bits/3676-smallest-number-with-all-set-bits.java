class Solution {
    public int smallestNumber(int n) {
     String str = Integer.toBinaryString(n);
    int size=str.length();
    int res = 0;
    for(int i=0; i<size; i++)
    {
   res=res*10+1;
    }
    return Integer.parseInt(String.valueOf(res),2);
    }
}