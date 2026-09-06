class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<col;j++){
                if(set.contains(board[i][j]) && board[i][j]!='.') return false;
                set.add(board[i][j]);
            }
        }
        for(int j=0;j<col;j++){
            HashSet<Character> set=new HashSet<>();
            for(int i=0;i<row;i++){
                if(set.contains(board[i][j]) && board[i][j]!='.') return false;
                set.add(board[i][j]);
            }
        }
        for(int i=0;i<row;i=i+3){
            for(int j=0;j<col;j=j+3){
                HashSet<Character> set=new HashSet<>();
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        if(set.contains(board[k][l]) && board[k][l]!='.') return false;
                        set.add(board[k][l]);
                    }
                }
            }
        }
        return true;
    }
}