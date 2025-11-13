class Solution {
    public int maxOperations(String s) {
        int oneCount =0;
        int i=0;
        int ans=0;
        int n=s.length();
        while(i<n){
            if(s.charAt(i)=='0'){
                while(i+1<n && s.charAt(i+1)=='0'){
                    i++;
                }
                ans+=oneCount;
            }
            else{
                oneCount++;
            }
            i++;
        }
        return ans;
    }
}