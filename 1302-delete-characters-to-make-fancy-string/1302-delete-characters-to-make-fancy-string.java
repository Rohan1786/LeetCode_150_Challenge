class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        if(n<=2) return s;
        res.append(s.charAt(0));
        res.append(s.charAt(1));
        for(int i=2;i<n;i++){
            char currentChar = s.charAt(i);
            if(currentChar!=res.charAt(res.length()-1) || currentChar!=res.charAt(res.length()-2)){
                res.append(currentChar);
            } 
        }
        return res.toString();
    }
}