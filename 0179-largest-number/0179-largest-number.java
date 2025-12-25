class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] strs = new String[n];
        for(int i=0;i<n; i++){
            strs[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>(){
          public int compare(String a, String b){
            String aa = a+b;
            String bb = b+a;
            return bb.compareTo(aa);
          }  
        });
        StringBuilder rs = new StringBuilder();
        for(String name: strs){
        rs.append(name);
        }
        return rs.toString().charAt(0)=='0' ?"0":rs.toString();

    }
}