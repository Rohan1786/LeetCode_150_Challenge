class Solution {
    int m;
    int n;
    public int numRookCaptures(char[][] board) {
        m=board.length;
        n = board[0].length;
        int count=0;
        int [][] dirs = {{-1,0},{1,0},{0,1},{0,-1}};
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j]=='R') {
                  int r=i;
                  int c=j;
                  for(int[] dir: dirs){
                    int nr = r+dir[0];
                    int nc = c+dir[1];
                    while (nr >= 0 && nr < m && nc >= 0 && nc < n && board[nr][nc] != 'B') {
                   if(board[nr][nc]=='p'){
                    count++;
                    break;
                   }
                   nr +=dir[0];
                   nc+=dir[1];
                    }

                  }
                }
            }
        }
        return count;
    }
}