class Solution {
    String[] keyboards = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        backTrack(digits, res, "", 0);
        return res;
    }
    public void backTrack(String digits, List<String> res, String combinations, int index){
        if(digits.length()==index){
            res.add(combinations);
            return;
        }
        String letters = keyboards[digits.charAt(index)-'0'];
        for(char letter: letters.toCharArray()){
            backTrack(digits, res, combinations+letter, index+1);
        }
    }
}