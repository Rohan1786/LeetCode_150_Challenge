class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int n = str.length;
        StringBuilder result = new StringBuilder();
        for(int i = n-1;i>=0;i--){
            if(i==0){
                result.append(str[i]);
            }
            else{
result.append(str[i]+" ");
            }
         
        }
        return result.toString();
    }
    
}