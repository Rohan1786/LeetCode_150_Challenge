class Solution {
    public int totalNQueens(int n) {
          char[][] queen = new char[n][n];
        List<List<String>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                queen[i][j]='.';
            }
        }
        return nQueens(queen, 0, ans).size();
    }

  public  List<List<String>> nQueens(char[][]queen, int row,  List<List<String>>ans){
        int n = queen.length;
    if(row==n){
      List<String> ll = new ArrayList<>();
      for(int i=0; i<n; i++){
        ll.add(new String(queen[i]));
      }
      ans.add(ll);
      return ans;
    }
        for (int j = 0; j < n; j++) {
            if (isSafe(queen, row, j)) {
                queen[row][j] = 'Q';         // place queen
                nQueens(queen, row + 1, ans); // move to next row
                queen[row][j] = '.';         // backtrack
            }
        }

        return ans;
        }
   public boolean isSafe(char[][] queens, int row, int col) {
    int n = queens.length;

    // check same row to the left
    int j = 0;
    while (j < col) {
        if (queens[row][j] == 'Q') return false;
        j++;
    }

    // check same row to the right (optional; usually not needed if placing one queen per row)
    j = col + 1;
    while (j < n) {
        if (queens[row][j] == 'Q') return false;
        j++;
    }

    // check same column above
    int i = 0;
    while (i < row) {
        if (queens[i][col] == 'Q') return false;
        i++;
    }

    // check left diagonal (up-left)
    i = row - 1;
    j = col - 1;
    while (i >= 0 && j >= 0) {
        if (queens[i][j] == 'Q') return false;
        i--;
        j--;
    }

    // check right diagonal (up-right)
    i = row - 1;
    j = col + 1;
    while (i >= 0 && j < n) {
        if (queens[i][j] == 'Q') return false;
        i--;
        j++;
    }

    return true;
}}