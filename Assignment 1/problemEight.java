/* 
💡Q8.You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.
Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
 */
public class problemEight {
    static int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] ==nums[i+1]) {
                return new int[]{nums[i] , nums[i]+1} ;
            }
        }
     return new int[]{} ;
    }
    /* above mehtod gets wrong in test case 3 thats why use second mentond    */
    static int[] findErrorNumsM2(int[] nums) {
        int duplicate = -1 ;
        int missing = -1 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])-1]  < 0) {
                duplicate = Math.abs(nums[i])  ;
            }else{
                nums[Math.abs(nums[i]) -1]*= -1 ;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]> 0) {
                missing = i+1 ;
            }
        }
     return new int[]{duplicate , missing } ;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,4} ;
        int[] results = findErrorNums(nums) ;
        for (int i : results) {
            System.out.print(i+" ");
        }
    }
}
