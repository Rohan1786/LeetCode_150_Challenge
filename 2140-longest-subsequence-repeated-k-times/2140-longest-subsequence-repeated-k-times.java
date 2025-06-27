// class Solution {
//     public String longestSubsequenceRepeatedK(String s, int k) {
//         char [] charArray = s.toCharArray();
//         int i =0,j=i+1;
//         int n = charArray.length;
//         if(n<k){
//             return "";
//         }
//         StringBuilder res = new StringBuilder();
//         while(i<n&&j<n){
//             int repeat = 1;
            
//             if(charArray[i]==charArray[j]){
//                 repeat++;
//                 if(k==repeat){
//                   res.append(charArray[j]);
//                   i++;
//                   repeat = 1;
//                   j = i+1;
//             }
//                 }
                 
//             else{
//                 j++;
//             }
//         }
//         return res.toString();
//     }
// }

class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        List<Character> validChars = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (freq.getOrDefault(ch, 0) >= k) {
                validChars.add(ch);
            }
        }

        String result = "";
        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            for (char ch : validChars) {
                String next = curr + ch;
                if (isKRepeatedSubsequence(s, next, k)) {
                    queue.offer(next);
                    if (next.length() > result.length() || 
                        (next.length() == result.length() && next.compareTo(result) > 0)) {
                        result = next;
                    }
                }
            }
        }

        return result;
    }

    // Function to check how many times "pattern" appears as a subsequence in "s"
    private boolean isKRepeatedSubsequence(String s, String pattern, int k) {
        int count = 0;
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (ch == pattern.charAt(i)) {
                i++;
                if (i == pattern.length()) {
                    count++;
                    i = 0;
                    if (count == k) return true;
                }
            }
        }
        return false;
    }
}

