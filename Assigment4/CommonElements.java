import java.util.ArrayList;
import java.util.List;

public class CommonElements {

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        List<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else {
                int minVal = Math.min(arr1[i], Math.min(arr2[j], arr3[k]));
                if (minVal == arr1[i]) {
                    i++;
                } else if (minVal == arr2[j]) {
                    j++;
                } else {
                    k++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        List<Integer> result = findCommonElements(arr1, arr2, arr3);
        System.out.println(result);
    }
}
