/* 
  Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 */

public class problemSeven {
    /* this problem is similar to bubble sort algorithm in which lagerst element of array move to its correct position but in this problem i have to move zeros to end array  for this i check current element== 0  and adjecent element != 0 of array then i swap this two nums it has time complexity of O(n^2) 
      */
    static void moveZeroes(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j]==0 && nums[j+1]!= 0) {
                    int temp = nums[j] ;
                    nums[j] = nums[j+1] ;
                    nums[j+1] = temp ;
                }
            }
        }   
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12} ;
        moveZeroes(nums); 
        for (int i : nums) {
            System.out.print(i+ " ");
        }
    }
}
