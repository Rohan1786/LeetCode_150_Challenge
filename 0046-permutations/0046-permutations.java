class Solution {
public void helper(int[] nums, List<Integer> arr,boolean[] isVisited, List<List<Integer>>ans)
{
     int n = nums.length;
    if(arr.size()==n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(arr.get(i));
        }
        ans.add(list);
        return;
    }
    for(int i=0; i<n; i++) {
        if(!isVisited[i]){
            arr.add(nums[i]);
            isVisited[i]=true;
            helper(nums,arr,isVisited,ans);
            arr.remove(arr.size()-1);
            isVisited[i]=false;
        }
    }
}    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    int n = nums.length;
    List<Integer>arr = new ArrayList<>();
    boolean[] isValid = new boolean[n];
    helper(nums, arr, isValid, ans);
    return ans;
    }
}