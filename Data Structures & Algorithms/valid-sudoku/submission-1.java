class Solution {
    public boolean checkRows(char[][] board){
        for(int i=0;i<9;i++){
            int[] check = new int[9];
            for(int j=0;j<9;j++){
                char val = board[i][j]; 
                if(val != '.'){
                    if(check[val-'1'] != 1)
                        check[val-'1'] = 1;
                    else
                     return false;
                }
            }
        }
        return true;
    }
    public boolean checkCols(char[][] board){
        for(int i=0;i<9;i++){
            int[] check = new int[9];
            for(int j=0;j<9;j++){
                char val = board[j][i]; 
                if(val != '.'){
                    if(check[val-'1'] != 1)
                        check[val-'1'] = 1;
                    else
                     return false;
                }
            }
        }
        return true;
    }
    public boolean checkSquares(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int x = i*3 + 1;
                int y = j*3 + 1;
                // System.out.println("x:"+x + " y:" +y);
                int[] dir = {1, 0, -1, 0, 1, 1, -1, -1, 1};
                int[] check = new int[9];
                if(board[x][y] != '.')
                    check[board[x][y]-'1'] = 1;
                for(int k=0;k<8;k++){
                    char val = board[x+dir[k]][y+dir[k+1]];
                    // System.out.println("board[" + (x+dir[k]) + "][" + (y +dir[k+1]) +"]: "+ val );
                    if(val == '.') continue;
                    if(check[val-'1'] != 1)
                        check[val-'1'] = 1;
                    else
                        return false;
                }
                
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return checkRows(board) && checkCols(board) && checkSquares(board);
    }
}
