class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] field1=new int[26];
        int[] field2 = new int[26];
        for(int i=0; i<s1.length(); i++){
            field1[s1.charAt(i)-'a']++;
            field2[s2.charAt(i)-'a']++;
        }
        for(int i=0; i<s2.length()-s1.length(); i++){
           if(matches(field1, field2)){
            return true;
           }
           field2[s2.charAt(i+s1.length())-'a']++;
           field2[s2.charAt(i)-'a']--;
        }
        return matches(field1, field2);
    }
    public boolean matches(int[] field1, int[] field2){
        for(int i=0; i<26; i++){
            if(field1[i]!=field2[i]){
                return false;
            }
            
        }
        return true;
    }

}