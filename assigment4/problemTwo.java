class Solution {
    public int arrangeCoins(int n) {
         int coins = n ;
        for (int i =1; i <= n  ; i++) {
            coins = coins-i ;
            if (coins<0) {
                return i -1 ;
            }
        }

        return   1 ;
    }
}
