class Solution {
    public char findTheDifference(String s, String t) {
    int[] field = new int[26];
    for(char ch: s.toCharArray()){
        field[ch-'a']++;
    }
    StringBuilder res = new StringBuilder();
    for(char ch: t.toCharArray()){
        if(field[ch-'a']==0){
     return ch;
        } else{
            field[ch-'a']--;
        }
    }
    return '$';
    }
}