class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1map = new int[26];
        int[] s2map= new int[26];
        if(s2.length()<s1.length()) return false;
        for(int i=0; i<s1.length(); i++){
            s1map[s1.charAt(i)-'a']++;
            s2map[s2.charAt(i)-'a']++;
        }
        if(matches(s1map, s2map)){
            return true;
        }
        for(int i=0; i<s2.length()-s1.length(); i++){
            if(matches(s2map, s1map)) return true;
            s2map[s2.charAt(i+s1.length())-'a']++;
            s2map[s2.charAt(i)-'a']--;
        }
        return matches(s1map, s2map);
    }
    public boolean matches(int[]f1, int[] f2){
        for(int i=0; i<26; i++){
            if(f1[i]!=f2[i]){
                return false;
            }
        }
        return true;
    }
}