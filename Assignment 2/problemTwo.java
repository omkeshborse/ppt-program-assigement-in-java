// time O(n ) space o(1) ;


public class problemTwo {
    static int distributeCandies(int[] candyType) {
        int uniqueTypes = 1;
        for (int i = 1; i < candyType.length && uniqueTypes < candyType.length / 2; i++) {
            if (candyType[i] != candyType[i - 1]) {
                uniqueTypes++;
            }
        }

        return uniqueTypes;
    }

    public static void main(String[] args) {
        int[] candyType = { 1, 1, 2, 2, 3, 3 };
        int uniqueCandy = distributeCandies(candyType);
        System.out.println(uniqueCandy);

    }
}
