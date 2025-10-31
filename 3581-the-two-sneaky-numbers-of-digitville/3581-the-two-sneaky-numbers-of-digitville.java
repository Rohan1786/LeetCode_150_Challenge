class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()==2){
           arr.add(entry.getKey());
            }
        }
        int res[]=new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}