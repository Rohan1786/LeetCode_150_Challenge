class Solution {
    public boolean canEat(int[] piles, int mid, int h) {
        int hours=0;
        for(int x: piles) {
           hours+=x/mid;
           if(x%mid!=0) {
            hours++;
           }
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l =1;
        int r=Arrays.stream(piles).max().getAsInt();
        while(l<r){
            int mid = l+(r-l)/2;
            if(canEat(piles, mid, h)) {
                r=mid;
            } else{
                l=mid+1;
            }
        }
        return l;
    }
}