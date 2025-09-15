class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        int res =0;
        
        String[] textArray = text.split(" ");
        int n = textArray.length;
        for(int i=0; i<textArray.length; i++){
            String name = textArray[i];
            int count=0;
          for(char c: brokenLetters.toCharArray()){
            if(name.indexOf(c)!=-1){
               count=1;
            }
          }
          res+=count;
          
        }
        return res==n?0:n-res;
    }
}