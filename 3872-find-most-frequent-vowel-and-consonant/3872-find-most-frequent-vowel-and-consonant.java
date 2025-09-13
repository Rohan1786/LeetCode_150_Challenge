class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>(Arrays.asList(
            'a','e','i','o','u'
        ));
        int countVowels=0;
        int countConsonants=0;
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            char ch = entry.getKey();
            int count = entry.getValue();
            if(set.contains(ch)){
                countVowels=Math.max(count, countVowels);
            }
            else{
             
                countConsonants = Math.max(countConsonants, count);
            }
        }
        return countConsonants+countVowels;
    }
}