class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for(int i = 0; i < n; i++){
            int hIndexing = n-i;
            if(hIndexing <= citations[i]){
                return hIndexing;
            }
        }
        return 0;
    }
}