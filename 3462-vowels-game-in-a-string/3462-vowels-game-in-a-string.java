class Solution {
    public boolean doesAliceWin(String s) {
        HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        s=s.toLowerCase();
        int cnt=0;
        int size =0;
        for(char c: s.toCharArray()){
            if(set.contains(c)) {cnt++;}
            
        }
       return cnt>=1;
    }
}