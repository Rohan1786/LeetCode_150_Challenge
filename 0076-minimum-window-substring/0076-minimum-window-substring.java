class Solution {
    public String minWindow(String s, String t){
      int ns = s.length(), nt = t.length();
      if(ns<nt|| ns==0||nt ==0) return "";
      Map<Character, Integer> maps = new HashMap<>();
      Map<Character, Integer> mapt = new HashMap<>();
      for(char ch: t.toCharArray()){
        mapt.put(ch, mapt.getOrDefault(ch, 0)+1);
      }
      int required = mapt.size();
      int left =0;
      int minLen =Integer.MAX_VALUE;
      int startIndex =0;
      int formed =0;
      for(int right =0; right<ns; right++){
        char ch = s.charAt(right);
        maps.put(ch, maps.getOrDefault(ch, 0)+1);
        if(mapt.containsKey(ch) && maps.get(ch).intValue()==mapt.get(ch).intValue()){
            formed++;
        }
         

            while (left <= right && formed == required) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                char use = s.charAt(left);
                maps.put(use, maps.get(use) - 1);

                if (mapt.containsKey(use) &&
                    maps.get(use).intValue() < mapt.get(use).intValue()) {
                    formed--;
                }
                left++;
            }
      }
     return minLen ==Integer.MAX_VALUE?"":s.substring(startIndex, minLen+startIndex);
     }
}