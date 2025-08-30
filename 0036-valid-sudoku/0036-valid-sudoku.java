class Solution {
    public boolean isValidSudoku(char[][] board) {
     
        // Boolean arrays to track digits in rows, columns, and boxes
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue; // empty cell

                int digit = c - '1'; // convert '1'-'9' to 0-8

                int boxIndex = (i / 3) * 3 + (j / 3); // 3x3 box numbering 0..8

                if (row[i][digit] || col[j][digit] || box[boxIndex][digit]) {
                    return false; // duplicate found
                }

                row[i][digit] = true;
                col[j][digit] = true;
                box[boxIndex][digit] = true;
            }
        }

        return true; // valid Sudoku
    }

    
}