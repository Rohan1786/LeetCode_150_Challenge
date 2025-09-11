class Solution {
    public String sortVowels(String s) {
       HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
StringBuilder res = new StringBuilder();
//char array it will store vwesl
//res builder = result character
ArrayList<Character> listVowels = new ArrayList<>();
for(char c: s.toCharArray()) {
    if(vowels.contains(c)) {
        listVowels.add(c);
    }
}
Collections.sort(listVowels);
int i=0;
for(char c: s.toCharArray()){
   if(vowels.contains(c))
   {
   res.append(listVowels.get(i));
   i++;
   }
   else{
    res.append(c);
   }
}
return res.toString();
    }
}