class Solution {
    public boolean solve(String s){
        int left =0;
        int right = s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        return solve(s);
        // StringBuilder str= new StringBuilder(s);
        // str.reverse();
        // String p = str.toString();
        // return s.equals(p);
    }
}