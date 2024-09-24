public class wordSearchMatrix {
    public boolean exist(char[][] board, String word) {
        return helper(board, word, 0, 0, 0);
    }
    public boolean helper(char[][] board,String word,int i,int j,int idx){
        if(idx==word.length()-1) return true;
        else if(board[i][j]==word.charAt(idx)){
            idx++;
            if(i>1 && board[i-1][j]==word.charAt(idx)) helper(board,word,i-1,j,idx);
            if(j>1 && board[i][j-1]==word.charAt(idx)) helper(board,word,i,j-1,idx);
            if(i<board.length-2 && board[i+1][j]==word.charAt(idx)) helper(board, word, i+1, j, idx);
            if(j<board[0].length-2 && board[i][j+1]==word.charAt(idx)) helper(board, word, i, j+1, idx);
        }

        if(j<board[0].length-2) return helper(board, word, i, j+1, idx); 
        else if(i<board.length-2 && j==board[0].length-1) return helper(board, word, i+1, 0, idx);

        return false;
    }
}
