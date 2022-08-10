/**
 * @author Aayush Patel
 * @email aayushpatel1921@gmail.com
 */

public class OneDQueenCombination {

    static  int count =0;

    public static void main(String[] args) {

        QueenCombination(new boolean[4], 0,2, "", -1);
    }

    public static void QueenCombination(boolean[] boxes, int qpsf, int tq, String ans, int lastBoxUsed) {

        if(qpsf == tq){
            count++;
            System.out.println(count + ". " + ans);
            return;
        }
        for (int i = lastBoxUsed+1; i < boxes.length; i++) {

                boxes[i] = true;
                QueenCombination(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ", i);
                //this will undo the work which we've done that's called Backtracking
                boxes [i] = false;

        }
    }

}
