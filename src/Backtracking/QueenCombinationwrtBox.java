public class QueenCombinationwrtBox {

    public static void main(String[] args) {

        QueenCombinationBoxRespect(new boolean[4], 0, 0, 2, "");
    }

    public static void QueenCombinationBoxRespect(boolean[] board, int col, int qpsf, int tq, String ans){

        //Positive Base Case
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }

        //Negative Base Case
        if(col == board.length){
            return;
        }

        //Place the queen
        board[col] = true;
        QueenCombinationBoxRespect(board, col+1, qpsf+1, tq, ans + "b" + col);
        board[col] = false;

        //Not place
        QueenCombinationBoxRespect(board, col+1, qpsf, tq, ans);
    }
}
