class Solution {
    public int[] shuffle(int[] nums, int n) {
    int size = nums.length;
    int[] res = new int[size];
    int i=0;
    int j=n;
    int k=0;
    while(i<n && j<size){
        res[k++]=nums[i];
        res[k++]=nums[j];
        i++;
        j++;
    }
    return res;
    }
}