class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new LinkedHashMap<>();
        for(String  str: strs){
        int[] field = new int[26];
        for(char ch: str.toCharArray()){
            field[ch-'a']++;
        }
        String name = Arrays.toString(field);
if(map.containsKey(name)) {
    map.get(name).add(str);
}
else
{
    map.put(name, new ArrayList<>());
    map.get(name).add(str);
}
}

return new ArrayList<>(map.values());

    }
}