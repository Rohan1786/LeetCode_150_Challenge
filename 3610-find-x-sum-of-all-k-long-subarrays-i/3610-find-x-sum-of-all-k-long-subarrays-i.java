class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
     int[] res = new int[n-k+1];
       for(int i=0; i<=n-k; i++){
          HashMap<Integer, Integer> map = new HashMap<>();
      for(int j=i; j<i+k; j++){
        int num=nums[j];
        map.put(num, map.getOrDefault(num, 0)+1);
      }
      List<int[]> freq = new ArrayList<>();
      for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
        freq.add(new int[]{entry.getValue(), entry.getKey()});
      }
      freq.sort((a, b)->b[0]!=a[0]?b[0]-a[0]:b[1]-a[1]);
      int xsum =0;
      for(int j=0; j<x && j<freq.size(); ++j){
        xsum+=freq.get(j)[0]*freq.get(j)[1];
      }
      res[i]=xsum;
       }     

return res;
    }
}