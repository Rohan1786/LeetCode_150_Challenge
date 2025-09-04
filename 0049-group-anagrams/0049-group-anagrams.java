class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        int[] ch = new int[26];
        
        for (String s : strs) {
            Arrays.fill(ch, 0);
            for (char c : s.toCharArray()) {
                ch[c - 'a']++;
            }
            
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                res.append('#').append(ch[i]);
            }
            String key = res.toString();
            
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}
