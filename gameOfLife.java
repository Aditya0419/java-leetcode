public class gameOfLife {
    public  static void gameOfLife(int[][] board) {
        int[][] newB = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int count = 0;
                if (i - 1 >= 0 && j - 1 >= 0 && board[i - 1][j - 1] == 1)
                    count++;
                if (i - 1 >= 0 && board[i - 1][j] == 1)
                    count++;
                if (i - 1 >= 0 && j + 1 < board[0].length && board[i - 1][j + 1] == 1)
                    count++;
                if (j - 1 >= 0 && board[i][j - 1] == 1)
                    count++;
                if (j + 1 < board[0].length && board[i][j + 1] == 1)
                    count++;
                if (i + 1 < board.length && j - 1 >= 0 && board[i + 1][j - 1] == 1)
                    count++;
                if (i + 1 < board.length && board[i + 1][j] == 1)
                    count++;
                if (i + 1 < board.length && j + 1 < board[0].length && board[i + 1][j + 1] == 1)
                    count++;
                System.out.println(count); 
                if (board[i][j] == 1 && (count < 2 || count > 3)){
                    System.out.println(count);
                    newB[i][j] = 0;
                }
                else if (board[i][j] == 0 && count == 3){
                    System.out.println(count);
                    newB[i][j] = 1;
                }else {
                    newB[i][j] = board[i][j];
                }
                    

            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = newB[i][j];
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[][] { { 1,1 }, { 1, 0 }};
        gameOfLife(board);
    }
}
