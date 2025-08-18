class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character> set= new HashSet<>();
        HashSet<Character> seen= new HashSet<>();
        for(char ch: s.toCharArray()){
          if(!set.contains(ch)){
            set.add(ch);
          }
          else{
            seen.add(ch);
            set.remove(ch);
          }
        }
        int n= s.length();
        for(int i=0;i<n; i++){
        if(set.contains(s.charAt(i))&& !seen.contains(s.charAt(i))){
            return i;
        }
        }
        return -1;
    }
}