import java.util.HashMap;
import java.util.Map;

public class ContiguousSubarray {
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);  // Initial count of 0 is -1
        int maxLen = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count--;
            } else {
                count++;
            }

            if (countMap.containsKey(count)) {
                int prevIndex = countMap.get(count);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                countMap.put(count, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        System.out.println(findMaxLength(nums));  // Output: 2
    }
}
