class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character,Integer> mapS = new HashMap<>();
        // HashMap<Character,Integer> mapT = new HashMap<>();
        // int ns = s.length();
        // int nt = t.length();
        // int cnt =0;
        // if(ns==nt) return false;
        // for(char ch:s.toCharArray()){
        //     mapS.put(ch,mapS.getOrDefault(ch,0)+1);
        // }
        // for(int i = 0;i<ns;i++){
        //     char srt = t.charAt(i);
        //     if(mapS.containsValue(srt)){
        //         cnt++;
        //     }
        // }
        // return cnt==ns-1?true:false;
       int ns = s.length();
       int nt=t.length();
       if(ns!=nt){
        return false;
       }
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();
        int cnt=0;
        Arrays.sort(chs);
        Arrays.sort(cht);
        for(int i = 0;i<chs.length;i++){
            if(chs[i]==cht[i]){
                cnt++;
            }
        }
        return cnt==ns?true:false;
    }
}