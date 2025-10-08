class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //26 chars 
        
        //  HashMap<String,List<String>> map = new LinkedHashMap<>();
        
        // for(String name: strs) {
        //     StringBuilder res = new StringBuilder();
        //      int[] field = new int[26];
        //      for(char ch: name.toCharArray()) {
        //         field[ch-'a']++;
        //      }
        //      for(int num: field) {
        //         res.append(num).append("#");
        //      }
        //       String key = res.toString();
        //     if(!map.containsKey(key)) {
        //         map.put(key, new ArrayList<>());
        //     }
        //     map.get(key).add(name);
        // }
        //   List<List<String>> result = new ArrayList<>(map.values());
        // return result;

        HashMap<String, List<String>> map = new HashMap<>();
        for(String name: strs) {
            char[] chArr = name.toCharArray();
            Arrays.sort(chArr);
            String res = new String(chArr);
            if(!map.containsKey(res)) {
                map.put(res, new ArrayList<>());
            }
            map.get(res).add(name);
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}