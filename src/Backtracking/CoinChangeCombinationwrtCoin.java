/**
 * This is not question of Backtraking but for better understanding of
 * how do we make a recursive call
 * Given several denominations{2,3,4,5,6} and infinite supply of this denomination are available using this we need to prepare amount 10 ???
 * @author Aayush Patel
 * @email aayushpatel1921@gmail.com
 */
//This approach is acc. to Coin respect
public class CoinChangeCombinationwrtCoin {

    public static void main(String[] args) {

        CoinChangeCoinRespect(new int[] {2,3,5,6}, 0,10, "");
    }
    //vidx = virtual index
    public static void CoinChangeCoinRespect(int[] denom, int vidx, int amount, String ans){

        //Positive Base Case
        if(amount==0){
            System.out.println(ans);
            return;
        }
        //Negative Base Case
        if(amount<0 || vidx == denom.length){
            return;
        }
        //Coin give its contribution
        CoinChangeCoinRespect(denom, vidx, amount-denom[vidx], ans+denom[vidx]);

        //Coin don't give its contribution
        CoinChangeCoinRespect(denom, vidx+1, amount, ans);
    }
}
