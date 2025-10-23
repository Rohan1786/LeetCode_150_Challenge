class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length()-1; i++)
        {
           int c1= s.charAt(i)-'0';
           int c2 = s.charAt(i+1)-'0';
           int ans = (c1+c2)%10;
           String str = String.valueOf(ans);
           res.append(str);
        }
        
        while(res.length()!=2){
            StringBuilder result = new StringBuilder();
for(int i=0; i<res.length()-1; i++){
int first=res.toString().charAt(i)-'0';
int second = res.toString().charAt(i+1)-'0';
  String str = String.valueOf((first + second) % 10);
    result.append(str); // fixed: was result.add(str)
            }
res.setLength(0);
res.append(result);
        }
       
        return res.charAt(0)==res.charAt(1);
    }
}