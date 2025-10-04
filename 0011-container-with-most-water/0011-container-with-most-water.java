class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        //height*width
         int ans=0;
        while(i<j){
            ans=Math.max((j-i)*Math.min(height[i],height[j]),ans);
          
          maxArea=Math.max(maxArea, ans);
          if(height[i]<height[j]){
            i++;
          }
          else{
            j--;
          }
        }
        return maxArea;
    }
}