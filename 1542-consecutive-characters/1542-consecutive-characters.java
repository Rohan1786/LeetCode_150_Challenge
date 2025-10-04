class Solution {
    public int maxPower(String s) {
        int i=0;
        int j=i+1;
        int n = s.length();
        if(n==1) return 1;
        int cnt=1;
        int maxCount = 0;
    if(n==2){
         char ch1= s.charAt(i);
        char ch2 = s.charAt(j);
        if(Character.compare(ch1, ch2)==0){
          return 2;
    }}
        while(j<n){
        char ch1= s.charAt(i);
        char ch2 = s.charAt(j);
        
        if(Character.compare(ch1, ch2)==0){
            cnt++;
        } else{
            maxCount =Math.max(cnt, maxCount);
            cnt=1;
        }
        i++;
        j++;
        }
        return maxCount<cnt?cnt:maxCount;
    }
}