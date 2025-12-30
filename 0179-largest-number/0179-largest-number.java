class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] check = new String[n];
        for(int i=0; i<n; i++){
            check[i]=nums[i]+"";
        }
        Arrays.sort(check, new Comparator<String>(){
            public int compare(String a, String b){
                String aa = a+b;
                String bb=b+a;
                return bb.compareTo(aa);
            }
        });
        StringBuilder res = new StringBuilder();
        for(String name: check){
            res.append(name);
        }
        String result = res.toString();
        return result.charAt(0)=='0'? "0": result;
    }
}