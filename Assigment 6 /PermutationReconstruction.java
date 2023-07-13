import java.util.Arrays;

public class PermutationReconstruction {
    public static int[] findPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];
        int low = 0, high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = low;
                low++;
            } else {
                perm[i] = high;
                high--;
            }
        }

        perm[n] = low;  // or perm[n] = high

        return perm;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] result = findPermutation(s);
        System.out.println(Arrays.toString(result));

        s = "III";
        result = findPermutation(s);
        System.out.println(Arrays.toString(result));

        s = "DDI";
        result = findPermutation(s);
        System.out.println(Arrays.toString(result));
    }
}
