public class StandardNQueens {
    public static void main(String[] args) {

        boolean[][] board = new  boolean[4][4];
        NQueens(board, 0, 0, 0, board.length, "");
    }

    public static void NQueens(boolean[] [] board,int row, int col, int qpsf, int tq, String ans){

        //Positive Base Case
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }

        // Manually variables change if queen cross the column length
//        if(col == board[0].length){
//            row++;
//            col = 0;
//        }
//There are two approaches either change variables manually or make extra recursive call

        //Extra Recursive Call
        if(col == board[0].length){
            NQueens(board,row+1, 0,qpsf,tq,ans);
            return;
        }

        //Negative Base Case if queen cross the row length
        if(row == board.length){
            return;
        }

        //Place the queen only if it is safe
        if(isItSafeToPlaceTheQueen(board,row,col)) {
            board[row][col] = true;
            NQueens(board, row+1, 0, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
            board[row][col] = false;
        }

        //Not place
        NQueens(board, row, col+1, qpsf, tq, ans);
    }

    public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {

        // Vertically Upward
        int r = row -1;
        int c = col;
        while (r>=0){
            if(board[r][c]){
                return false;
            }
            r--;
        }

        // Horizontally left
        r = row;
        c = col-1;

        while (c>=0){
            if(board[r][c]){
                return false;
            }
            c--;
        }

        // Diagonally left
        r = row-1;
        c = col-1;
        while (r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        // Diagonally Right
        r = row-1;
        c = col+1;
        while (r>=0 && c < board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
