class Solution {
    public int lengthOfLongestSubstring(String s) {
    int left=0;
    int n =s.length();
    int maxLen = 0;
    HashSet<Character> set = new HashSet<>();
    for(int right=0; right<n; right++) {
       char ch= s.charAt(right);
       while(set.contains(ch)) {
        set.remove(s.charAt(left));
        left++;
       } 
       set.add(ch);
   maxLen = Math.max(right-left+1, maxLen);

    }
    return maxLen;
    }
}