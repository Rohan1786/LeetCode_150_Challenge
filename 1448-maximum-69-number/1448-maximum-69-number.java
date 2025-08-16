class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        // Replace only the first occurrence of '6' with '9'
        str = str.replaceFirst("6", "9");  
        return Integer.parseInt(str);
    }
}
