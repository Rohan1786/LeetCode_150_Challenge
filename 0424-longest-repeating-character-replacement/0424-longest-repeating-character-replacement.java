class Solution {
    public int characterReplacement(String s, int k) {
        int[] field = new int[26];
        int left =0;
        int max=0;
        int ans =0;
     for(int right =0; right<s.length(); right++){
         char ch = s.charAt(right);
         
         max=Math.max(++field[ch-'A'], max);
         if(right-left+1-max>k){
            field[s.charAt(left)-'A']--;
            left++;
         }
         ans = Math.max(ans, right-left+1);
     }
     return ans;
    }
}