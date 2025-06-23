class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int first = 0;
        int second = 0;
        for(int i = 0;i<numbers.length;i++){
        int calculate = target - numbers[i];
        first = i;
        for(int j =i+1;j<numbers.length;j++){
            if(calculate == numbers[j]){
                second = j;
                return new int[]{i+1,j+1};
            } 
        }
        }
        return new int[]{first,second};
    }
}