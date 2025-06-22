class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        StringBuilder str= new StringBuilder(s);
        str.reverse();
        String p = str.toString();
        return s.equals(p);
    }
}