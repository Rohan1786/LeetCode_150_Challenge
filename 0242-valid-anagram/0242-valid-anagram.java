class Solution {
    public boolean isAnagram(String s, String t) {
        // Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int tn = t.length();
        if(n!=tn) return false;
        // for(char ch: s.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0)+1);
        // }
        // for(char ch: t.toCharArray()) {
        //     if(!map.containsKey(ch)) {
        //         return false;
        //     }
        //     map.put(ch, map.get(ch)-1);
        //     if(map.get(ch)==0){
        //         map.remove(ch);
        //     }
        // }
        // return map.isEmpty();

        //now for the constant solutin
   int[] field=new int[26];
   for(char ch: s.toCharArray()) {
    field[ch-'a']++;
   }
   for(char ch: t.toCharArray()){
      field[ch-'a']--;
   }
   for(int i=0; i<26; i++){
    if(field[i]!=0){
      return false;
    }
   }
   return true;
        
    }
}