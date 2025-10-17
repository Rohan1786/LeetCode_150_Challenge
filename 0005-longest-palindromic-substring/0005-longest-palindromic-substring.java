class Solution {
    Boolean[][] dp;  // null = uncomputed, true/false = stored result
    int n;
    String s;
    String res = "";

    public boolean isPalindrome(int i, int j) {
        // empty substring
        if (i > j) return true;

        // single character -> palindrome; update result
        if (i == j) {
            dp[i][j] = true;
            if (1 > res.length()) {
                res = s.substring(i, i + 1);
            }
            return true;
        }

        if (dp[i][j] != null) return dp[i][j];

        if (s.charAt(i) == s.charAt(j)) {
            dp[i][j] = isPalindrome(i + 1, j - 1);
        } else {
            dp[i][j] = false;
        }

        if (dp[i][j] && (j - i + 1) > res.length()) {
            res = s.substring(i, j + 1);
        }

        return dp[i][j];
    }

    public String longestPalindrome(String s) {
        n = s.length();
        if (n == 0) return "";
        if (n == 1) return s;

        this.s = s;
        dp = new Boolean[n][n];
 
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                isPalindrome(i, j);
            }
        }
        return res;
    }
}
