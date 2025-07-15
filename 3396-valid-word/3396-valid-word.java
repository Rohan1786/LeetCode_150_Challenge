import java.util.regex.*;
class Solution {
    public boolean isValid(String word) {
      int n = word.length();
      word=word.toLowerCase();
      if(n<3) return false;
      for(char ch: word.toCharArray()){
       if(!Character.isLetterOrDigit(ch)) return false;
        }
        boolean v=false;
        boolean c= false;
        for(char ch: word.toCharArray()){
            if(isVowel(ch)) v=true;
            else if(Character.isLetter(ch)) c=true; 
        }
         return c & v;
      
     
    }
    boolean isVowel(char ch){
        return "aeiou".indexOf(ch)>=0;
    }
}