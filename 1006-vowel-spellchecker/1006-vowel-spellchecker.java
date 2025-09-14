
class Solution {
    private boolean capital(String str) {
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if (ch1 < 'A' || ch1 > 'Z' || ch2 < 'A' || ch2 > 'Z') {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // replace vowels with *
    private String devowel(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            char lower = Character.toLowerCase(c);
            if ("aeiou".indexOf(lower) >= 0) {
                sb.append('*');
            } else {
                sb.append(lower);
            }
        }
        return sb.toString();
    }

    // using your "check" idea → but adapted for vowel-insensitive match
    private String check(String str, Map<String,String> lowerMap, Map<String,String> vowelMap) {
        String lower = str.toLowerCase();
        if (lowerMap.containsKey(lower)) {
            return lowerMap.get(lower);   // case-insensitive match
        }
        String devow = devowel(str);
        if (vowelMap.containsKey(devow)) {
            return vowelMap.get(devow);   // vowel-insensitive match
        }
        return "";  // no match
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        int n = queries.length;
        String[] res = new String[n];

        Set<String> exactSet = new HashSet<>(Arrays.asList(wordlist));
        Map<String,String> lowerMap = new HashMap<>();
        Map<String,String> vowelMap = new HashMap<>();

        // build maps like in official sol, but with your check function
        for (String word : wordlist) {
            String lower = word.toLowerCase();
            lowerMap.putIfAbsent(lower, word);
            vowelMap.putIfAbsent(devowel(word), word);
        }

        for (int i = 0; i < n; i++) {
            String ans = queries[i];

            if (exactSet.contains(ans)) {
                res[i] = ans;   // exact match
            } else {
                res[i] = check(ans, lowerMap, vowelMap);
            }
        }

        return res;
    }
}
