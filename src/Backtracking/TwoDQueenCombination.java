public class TwoDQueenCombination {

    public static void main(String[] args) {

        QueenCombinationBoxRespect2D(new boolean[2][2], 0, 0, 0, 2, "");
    }

    public static void QueenCombinationBoxRespect2D(boolean[] [] board,int row, int col, int qpsf, int tq, String ans){

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
            QueenCombinationBoxRespect2D(board,row+1, 0,qpsf,tq,ans);
            return;
        }

        //Negative Base Case if queen cross the row length
        if(row == board.length){
            return;
        }

        //Place the queen
        board[row][col] = true;
        QueenCombinationBoxRespect2D(board, row, col+1, qpsf+1, tq, ans + "{" + row + "-" + col + "}");
        board[row][col] = false;

        //Not place
        QueenCombinationBoxRespect2D(board, row, col+1, qpsf, tq, ans);
    }
}
