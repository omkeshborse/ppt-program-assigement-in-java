public class problrmFour {
    /* n is number of varible to be plantat  */
    static boolean canPlaceFlower(int[] flowerbed , int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeftPot = ((i - 1) < 0 || flowerbed[i - 1] == 0);
                boolean emptyRigthPot = ((i + 1) >=flowerbed.length || flowerbed[i + 1] == 0);
                if (emptyLeftPot && emptyRigthPot) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }

        return count  >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1} ;
        int n = 1 ;
        boolean result = canPlaceFlower(flowerbed , n) ;
        System.out.println(result);
    }
}
