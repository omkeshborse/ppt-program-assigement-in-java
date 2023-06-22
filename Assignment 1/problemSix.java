/* 
 *
💡 **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true

 */


import java.util.Arrays;

public class problemSix {
    /* this has time complexity is O(n^2) */
    static boolean containsDuplicate(int[] nums ){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true ;
                }
            }
            }
        return false ;
    }
    static boolean containsDuplicateOptimize(int[] nums ){
        Arrays.sort(nums) ;
        for (int i = 0; i < nums.length; i++) {
           
                if(nums[i] == nums[i+1]){
                    return true ;
                }
            
            }
        return false ;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1} ;
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicateOptimize(nums));
    }
}
