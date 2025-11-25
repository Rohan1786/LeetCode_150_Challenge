class Solution {
    public String minWindow(String s, String t) {
              int ns = s.length();
        int nt = t.length();

        if (ns == 0 || nt == 0 || ns < nt) {
            return "";
        }

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
 
        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int have = 0;  
        int required = need.size(); 

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < ns; right++) {

            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch) && window.get(ch).intValue() == need.get(ch).intValue()) {
                have++;
            }

            // Try shrinking
            while (have == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char drop = s.charAt(left);
                window.put(drop, window.get(drop) - 1);

                if (need.containsKey(drop) && window.get(drop).intValue() < need.get(drop).intValue()) {
                    have--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}