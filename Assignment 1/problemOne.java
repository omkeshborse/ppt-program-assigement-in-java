/* 
 * 
💡Q1. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order
Example:
Input: nums = [2,7,11,15], target = 9
Output0 [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
 */


public class problemOne{
    static int[] twoSum(int []arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+ arr[j] == target) {
                    return new int[]{i , j} ;
                }
            }
        }
        return new int[]{} ;
    }


    public static void main(String[] args) {
        int[] arr = { 2,7,11,15} ;
        int[] result =  twoSum(arr, 9) ;
        for (int i : result) {
            System.out.println( i);
        }
    }
}