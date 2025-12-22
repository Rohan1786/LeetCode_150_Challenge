class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] rowSet = new HashSet[N];
        HashSet<Character>[] colSet= new HashSet[N];
        HashSet<Character>[] boxSet = new HashSet[N];
        for(int r=0; r<N; r++){
            rowSet[r]=new HashSet<>();
            colSet[r]=new HashSet<>();
            boxSet[r]=new HashSet<>();
        }
        for(int r=0; r<N; r++)
        {
            for(int c=0; c<N; c++){
                char val = board[r][c];
                if(val=='.') continue;
                else{
                    if(rowSet[r].contains(val))
                    {
                        return false;
                    }
                    rowSet[r].add(val);
                    if(colSet[c].contains(val)){
                        return false;
                    }
                    colSet[c].add(val);
                    int box = (r/3)*3+c/3;
                    if(boxSet[box].contains(val)){
                        return false;
                    }
                    boxSet[box].add(val);
                }
            }
        }
        return true;
    }
}