import java.util.Arrays;

public class problemThree {
      static int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int maxLen = 0;
        
        while (right < nums.length) {
            if (nums[right] - nums[left] == 1) {
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else if (nums[right] - nums[left] > 1) {
                left++;
            } else {
                right++;
            }
        }
        
        return maxLen;
    }
    public static void main(String[] args) {
        int nums[] ={ 1,3,2,2,5,2,3,7}  ;
        int result = findLHS(nums ) ;
        System.out.println(result   );
    }
}
/* 
We define a harmonious array as an array where the difference between its maximum value
and its minimum value is exactly 1.

Given an integer array nums, return the length of its longest harmonious subsequence
among all its possible subsequences.

A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

Example 1:
Input: nums = [1,3,2,2,5,2,3,7]
Output: 5

Explanation: The longest harmonious subsequence is [3,2,2,2,3].
*/
