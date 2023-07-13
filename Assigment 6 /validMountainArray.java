public class MountainArray {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;

        // Check for increasing order
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Check if peak is not the first or last element
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Check for decreasing order
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1};
        System.out.println(validMountainArray(arr1));  // Output: false

        int[] arr2 = {3, 5, 5};
        System.out.println(validMountainArray(arr2));  // Output: false

        int[] arr3 = {0, 3, 2, 1};
        System.out.println(validMountainArray(arr3));  // Output: true
    }
}
