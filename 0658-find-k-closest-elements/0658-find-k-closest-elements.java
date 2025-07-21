class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>ans =new ArrayList<>();
        int n=arr.length;
        int l=0,r=n-k;
        while(l<r){
            int m = (l+r)/2;
            if(x-arr[m]>arr[m+k]-x){
                l=m+1;
            }
            else{
                r= m;
            }
        }
        for(int i=l;i<r+k;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}