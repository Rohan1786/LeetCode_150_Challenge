class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] occ = new int[26];
        int n = s.length();
        for(int i=0; i<n; i++){
            occ[s.charAt(i)-'a']=i;
        }
        int lastIndex =0;
        int startIndex=0;
       List<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++){
          lastIndex = Math.max(lastIndex, occ[s.charAt(i)-'a']);
          if(i==lastIndex){
            res.add(lastIndex-startIndex+1);
            startIndex=i+1;
          }
        }
        return res;
    }
}