class Solution {
 
    int m, n;
int[][] memo;
    public int solve(String word1, String word2, int i, int j) {
        // Base cases
        
        if (i == m) return n - j;   
        if (j == n) return m - i;  

        if(memo[i][j]!=-1){
            return memo[i][j];
        }
        if (word1.charAt(i) == word2.charAt(j)) {
            return solve(word1, word2, i + 1, j + 1);
        }

        // Otherwise, try all three operations:
        // Insert, Delete, Replace
        int insertOp = 1 + solve(word1, word2, i, j + 1);
        int deleteOp = 1 + solve(word1, word2, i + 1, j);
        int replaceOp = 1 + solve(word1, word2, i + 1, j + 1);

        
        return memo[i][j]=Math.min(insertOp, Math.min(deleteOp, replaceOp));
    }

    public int minDistance(String word1, String word2) {
        m = word1.length();
        n = word2.length();
        memo = new int[m][n];
        for(int[]arr: memo) {
            Arrays.fill(arr, -1);
        }
        return solve(word1, word2, 0, 0);
    }
}