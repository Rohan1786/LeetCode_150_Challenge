class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> treemap = new TreeMap<>();
        for(int num : hand){
            treemap.put(num, treemap.getOrDefault(num, 0)+1);
        }
    while(!treemap.isEmpty()){
        int first = treemap.firstKey();
        for(int i=0; i<groupSize; i++){
            int current = first+i;
            if(!treemap.containsKey(current)){
                return false;
            }
            int count = treemap.get(current);
            if(count == 1){
                treemap.remove(current);
            } else{
                treemap.put(current, treemap.get(current)-1);
            }
        }
    }
    return true;
    }
}