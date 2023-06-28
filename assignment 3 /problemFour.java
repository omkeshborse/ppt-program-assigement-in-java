public class problemFour {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition solution = new SearchInsertPosition();

        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int index = solution.searchInsert(nums, target);
        System.out.println(index);
        // Output: 2
    }
}
