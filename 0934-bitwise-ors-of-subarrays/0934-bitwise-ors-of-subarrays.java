class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        int n =arr.length;
        Set<Integer>prev=new HashSet<>();
        Set<Integer>curr=new HashSet<>();
        Set<Integer>result = new HashSet<>();

        for(int i=0;i<n;i++){
       for(int x: prev){
        curr.add(arr[i]|x);
        result.add(arr[i]|x);
       }
       curr.add(arr[i]);
       result.add(arr[i]);
       prev=curr;
       curr=new HashSet<>();

        }
        return result.size();
    }
}