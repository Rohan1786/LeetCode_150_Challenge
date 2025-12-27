class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left =0;
        int max =0;
        int ans =0;
        int n = s.length();
        for(int right =0; right<n; right++){
            max=Math.max(++count[s.charAt(right)-'A'], max);
            if((right-left+1)-max>k){
                count[s.charAt(left)-'A']--;
                left++;
            }
      ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}