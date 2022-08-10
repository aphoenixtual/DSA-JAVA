public class StandardNQueens2 {

    static  int count =0;
        public static void main(String[] args) {

           NQueens2(new boolean[4][4], 0,0,4,"");
        }

        public static void NQueens2(boolean[] [] board,int row, int qpsf, int tq, String ans){

            //Positive Base Case
            if(qpsf == tq){
                System.out.println(++count + ". " + ans);
                return;
            }

            //Negative Base Case if queen cross the row length
            if(row == board.length){
                return;
            }

            for (int col = 0; col < board[0].length; col++) {

                //Place the queen only if it is safe
                if (isItSafeToPlaceTheQueen(board, row, col)) {
                    board[row][col] = true;
                    NQueens2(board, row + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
                    board[row][col] = false;
                }

            }

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

