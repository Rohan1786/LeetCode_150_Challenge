class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        int prev=0;
        for(String name: operations) 
        {
        if(name.equals("++X")){
        ans+=1;
        } else if(name.equals("--X")){
   ans-=1;
        } else if(name.equals("X++")){
            ans+=1;
        } else if(name.equals("X--")){
            ans-=1;
        }  
         }
         return ans;
}}