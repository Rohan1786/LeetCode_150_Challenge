class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] field1 = new int[26];
        int[] field2 = new int[26];
        for(char ch: word1.toCharArray()){
            field1[ch-'a']++;
        }
         for(char ch: word2.toCharArray()){
            field2[ch-'a']++;
        }
        for(int i=0; i<26; i++){
          if((field1[i]==0&&field2[i]!=0) || (field2[i]==0&&field1[i]!=0)){
            return false;
          }
        }
        Arrays.sort(field1);
        Arrays.sort(field2);
        for(int i=0; i<26; i++){
            if(field1[i]!=field2[i]){
                return false;
            }
        }
        return true;
    }
}