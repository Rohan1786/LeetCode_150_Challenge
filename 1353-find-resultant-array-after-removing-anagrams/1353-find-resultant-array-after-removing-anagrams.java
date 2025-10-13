class Solution {
    public List<String> removeAnagrams(String[] words) {
         List<String> list = new ArrayList<>();
         String prev="";
         for(String word: words) {
            char []ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!sorted.equals(prev)){
            list.add(word);
            prev = sorted;
            }
         }
         return list;
    }
}