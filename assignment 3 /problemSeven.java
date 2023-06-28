import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();

        // Helper function to add range to the result
        // Converts lower and upper to string format
        // If lower and upper are the same, it's a single number
        // Otherwise, it's a range in the form "lower->upper"
        // and adds it to the result list
        addRange = (int start, int end) -> {
            if (start == end)
                result.add(String.valueOf(start));
            else
                result.add(start + "->" + end);
        };

        // Handle the case where lower is less than the first element in nums
        if (lower < nums[0]) {
            addRange.accept(lower, nums[0] - 1);
            lower = nums[0];
        }

        // Iterate through the nums array to find missing ranges
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] > 1) {
                addRange.accept(nums[i-1] + 1, nums[i] - 1);
                lower = nums[i];
            }
        }

        // Handle the case where upper is greater than the last element in nums
        if (upper > nums[nums.length - 1]) {
            addRange.accept(nums[nums.length - 1] + 1, upper);
        }

        return result;
    }
    public static void main(String[] args) {
		int[] nums = {0, 1, 3, 50, 75};
      int lower = 0;
      int upper = 99;

    Solution solution = new Solution();
    List<String> missingRanges = solution.findMissingRanges(nums, lower, upper);
    System.out.println(missingRanges);
	}
}
