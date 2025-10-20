import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, List<String>> map = new HashMap<>();
        String[] words = s.split(" ");
        int n = words.length;
        int pn = pattern.length();

        if (n != pn) return false;

        Set<String> usedWords = new HashSet<>();  

        for (int i = 0; i < n; i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
 
            map.putIfAbsent(ch, new ArrayList<>());

            List<String> list = map.get(ch);
 
            if (!list.isEmpty() && !list.get(0).equals(word)) {
                return false;
            }
 
            if (list.isEmpty()) {
                if (usedWords.contains(word)) return false;
                list.add(word);
                usedWords.add(word);
            }
        }

        return true;
    }
}
