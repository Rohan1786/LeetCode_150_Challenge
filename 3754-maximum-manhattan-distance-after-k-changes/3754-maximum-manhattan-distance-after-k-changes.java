class Solution {
    public int countValue(int a,int b,int c){
        return Math.abs(a-b)+c*2;
    }
    public int maxDistance(String s, int k) {
        int ans = 0;
        int east = 0, west = 0, north = 0, south = 0;
        for(char ch : s.toCharArray()){
            switch(ch) {
                case 'N': north++;
                break;
                case 'E': east++;
                break;
                case 'S': south++;
                break;
                case 'W': west++;
                break; 
            }

            int times1 = Math.min(k,Math.min(north,south));
        int times2 = Math.min(k-times1,Math.min(east,west));
        ans = Math.max(countValue(east,west,times1)+countValue(south,north,times2),ans);
            
        }
        

        return ans;
    }
}