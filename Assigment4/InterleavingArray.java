public class InterleavingArray {

    public static int[] interleaveArray(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = interleaveArray(nums, n);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
