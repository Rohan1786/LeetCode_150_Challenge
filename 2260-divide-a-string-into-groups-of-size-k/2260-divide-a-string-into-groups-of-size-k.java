class Solution {
    public String[] divideString(String s, int k, char fill) {
//         int n = s.length();
//         int ans = n % k;
//         int size = 0;
//         if(ans==0){
//             size = n/k;
//         }
//         else{
//             size=(n/k)+k;
//         }
//         String [] strArray = new String[size];
//         int p = 0;
//         String str = "";
//         for(int i =0;i<n;i+=k){
            
//             for(int j=i;j<k;j++){
//                 str+=s.charAt(j);
//             }
//             strArray[p]=str;
//             p++;
//             str="";
//         }
// if(ans!=0){


//         for(int i=0;i<ans;i++){
//          str+=fill;
//         }
//         strArray[p++]=str;
//         }
//         return strArray;
List<String> arr = new ArrayList<>();
int curr =0;
int n = s.length();
while(curr<n){
    int end = Math.min(curr+k,n);
    arr.add(s.substring(curr,end));
    curr+=k;
}
String strLast=arr.get(arr.size()-1);
if(strLast.length()<k){
    strLast+=String.valueOf(fill).repeat(k-strLast.length());
    arr.set(arr.size()-1,strLast);
    
}
return arr.toArray(new String[0]);
            }
}