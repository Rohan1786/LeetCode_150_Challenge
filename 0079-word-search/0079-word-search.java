class Solution {
    int n;
    int m;
 
 public boolean solve(char[][] board, String word, int i, int j,int index){
    if(index==word.length()){
       return true;
    }
     if (i < 0 || j < 0 || i >= n || j >= m || board[i][j] != word.charAt(index)) {
            return false;
        }
   
    char temp=board[i][j];
    board[i][j]='0';
    boolean found = solve(board, word, i+1, j, index+1)||
                     solve(board, word, i-1, j,index+1)||
                     solve(board, word, i, j+1, index+1)||
                    solve(board, word, i, j-1, index+1);
    board[i][j]=temp;
    return found;
 }
    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
         if(board[i][j]==word.charAt(0)){
            if(solve(board, word, i, j, 0)){
                return true;
            }
         }
            }
        }
        return false;
    }
}