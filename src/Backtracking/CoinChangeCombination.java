/**
 * This is not question of Backtraking but for better understanding of
 * how do we make a recursive call
 * Given several denominations{2,3,4,5,6} and infinite supply of this denomination are available using this we need to prepare amount 10 ???
 * @author Aayush Patel
 * @email aayushpatel1921@gmail.com
 */
//This approach is acc. to user respect
public class CoinChangeCombination {

    public static void main(String[] args) {

        CoinChange(new int[] {2,3,5,6}, 10, "", 0);
    }

    public  static  void CoinChange(int[] denom, int amount, String ans, int lastDenomIdx){

        if(amount==0){
            System.out.println(ans);
            return;
        }

        for(int i = lastDenomIdx; i < denom.length; i++){
            if(amount>=denom[i])
            CoinChange(denom, amount -denom[i], ans + denom[i], i);
        }
    }
}
