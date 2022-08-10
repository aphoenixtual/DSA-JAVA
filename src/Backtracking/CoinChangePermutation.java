/**
 * This is not question of Backtraking but for better understanding of
 * how do we make a recursive call
 * Given several denominations{2,3,4,5,6} and infinite supply of this denomination are available using this we need to prepare amount 10 ???
 * @author Aayush Patel
 * @email aayushpatel1921@gmail.com
 */
public class CoinChangePermutation {

    static  int count =0;

    public static void main(String[] args) {

        CoinChangeP(new int[] {2,3,5,6}, 10, "");
    }

    public  static  void CoinChangeP(int[] denom, int amount, String ans){

        if(amount==0){
            count++;
            System.out.println(count + ". " +ans);
            return;
        }

        if(amount < 0){
            return;
        }
        for(int i = 0; i < denom.length; i++){
                CoinChangeP(denom, amount -denom[i], ans + denom[i]);
        }
    }
}
