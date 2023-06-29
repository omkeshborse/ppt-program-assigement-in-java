public class completerows {
    static int arrangeCoins(int n){
        int coins = n ;
        for (int i = 1; i <= n  ; i++) {
            coins = coins-i ;
            if (coins<0) {
                return i -1 ;
            }
        }

        return   1 ;
    }
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(arrangeCoins(n));
    }
}
