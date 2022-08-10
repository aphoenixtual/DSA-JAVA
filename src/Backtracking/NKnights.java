public class NKnights {

    static  int count =0;

    public static void main(String[] args) {

        boolean[][] board = new  boolean[3][3];
        NKnight(board, 0, 0, 0, board.length, "");
    }

    public static void NKnight(boolean[] [] board,int row, int col, int kpsf, int tk, String ans){

        //Positive Base Case
        if(kpsf == tk){
            System.out.println(++count+ ". " + ans);
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
            NKnight(board,row+1, 0,kpsf,tk,ans);
            return;
        }

        //Negative Base Case if queen cross the row length
        if(row == board.length){
            return;
        }

        //Place the queen only if it is safe
        if(isItSafeToPlaceTheKnight(board,row,col)) {
            board[row][col] = true;
            NKnight(board, row, col+1, kpsf + 1, tk, ans + "{" + row + "-" + col + "}");
            board[row][col] = false;
        }

        //Not place
        NKnight(board, row, col+1, kpsf, tk, ans);
    }

    public static boolean isItSafeToPlaceTheKnight(boolean[][] board, int row, int col) {

        int[] rowArr = {-1,-2,-2,-1};
        int[] colArr = {2,1,-1,-2};

        for (int i=0; i<4; i++){

            int r = row + rowArr[i];
            int c = col + colArr[i];

            if(r >=0 && r < board.length && c>=0 && c < board[0].length) {
                if(board[r][c]){
                    return false;
                }
            }
        }
        return true;
    }
}
