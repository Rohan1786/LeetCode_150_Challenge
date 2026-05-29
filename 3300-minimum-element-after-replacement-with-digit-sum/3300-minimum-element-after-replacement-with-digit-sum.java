class Solution {
    public int minElement(int[] nums) {
        int small =Integer.MAX_VALUE;
        for(int num: nums){
            int res=0;
          String ans = Integer.toString(num);
          for(int i=0; i<ans.length(); i++){
            res+=ans.charAt(i)-'0';
          }
          if(res<small){
            small = res;
          }

        }
        return small;
    }
}