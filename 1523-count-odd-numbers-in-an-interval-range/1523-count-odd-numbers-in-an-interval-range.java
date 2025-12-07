class Solution {
    public int countOdds(int low, int high) {
    //     int cnt=0;
    //  while(low<=high){
    //     if(low%2!=0){
    //         cnt++;
    //         low+=2;
    //     }
    //    else{
    //     low++;
    //    }
    //  }
    //  return cnt;
    return (high+1)/2-(low)/2;
    }
}