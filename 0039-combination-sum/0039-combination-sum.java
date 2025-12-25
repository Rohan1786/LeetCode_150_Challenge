class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
       List<Integer> combinations = new ArrayList<>();
        solve(candidates , target, res, combinations, 0, 0);
        return res;
    }

    public void solve(int[] candidates, int target, List<List<Integer>> res, List<Integer> combo, int sum, int index){
        if(target==sum){
            res.add(new ArrayList<>(combo));
            return;
        }
        if(sum>target){
            return;
        }
        
        for(int i=index; i<candidates.length; i++){
            combo.add(candidates[i]);
            solve(candidates, target, res, combo, sum+candidates[i], i);
            combo.remove(combo.size()-1);
        }
    }
}