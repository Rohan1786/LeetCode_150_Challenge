class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        int i =0;
        int j = i+1;
        String sub = "";
        ArrayList<String> arr = new ArrayList<>();
        while(j<n && i<n) {
            if(num.charAt(i)!=num.charAt(j)){
                i++;
                j=i+1;
            }
            else{
                sub = num.substring(i,j+1);
                j++;
                if(sub.length()==3){
                   arr.add(sub);
                }
            }
        }
        Collections.sort(arr);
        return arr.size()==0?"":arr.get(arr.size()-1);
    }
}