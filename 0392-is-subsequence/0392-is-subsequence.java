class Solution {
    public boolean isSubsequence(String s, String t) {
       int i =0;
       int j =0;
       int n = s.length();
       int cnt =0;
       while(i<t.length() && j<s.length()){

        if(s.charAt(j)!=t.charAt(i)){
            i++;
        }
        else if(s.charAt(j)==t.charAt(i)){
            i++;
            j++;
            cnt++;
        }
       }
       return cnt==n?true:false;
    }
}