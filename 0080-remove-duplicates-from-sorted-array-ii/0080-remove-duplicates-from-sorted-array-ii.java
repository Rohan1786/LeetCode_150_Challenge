class Solution {
    // public int removeDuplicates(int[] nums) {
        // Based on map we can solve this problem very much effectively with complexity of 
        // Time complexity - O(n) and Space Complexity - O(n)
    // Map<Integer,Integer>map = new HashMap<>();
    // int k =0;
    // for(int num: nums){
    //     map.put(num,map.getOrDefault(num,0)+1);
    //     if(map.get(num)<=2){
    //         nums[k]=num;
    //         k++;
    //     }

    // }
    // return k;
    // }

// Time Complexity O(n) and Space Complexity O(1)
    public int removeDuplicates(int[] nums) {
        int i =0;
        for(int element: nums){
        if(i==0||i==1||nums[i-2]!=element){
            nums[i++]=element;
        }

        }
        return i;
    }
}