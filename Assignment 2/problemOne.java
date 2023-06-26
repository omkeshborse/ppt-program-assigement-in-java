/* time - O(nlog n) space - O(1) */ 
import java.util.Arrays;

public class problemOne{
    static int arrayPairSum(int[] nums) {
        int sum = 0 ;
        Arrays.sort(nums) ;
        for (int i = 0; i < nums.length; i+=2) {
            sum = sum + nums[i] ;
        }
        return sum ;
    }
    
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2} ;
        int[] nums1 = {1,4,3,2} ;
        int sum = arrayPairSum(nums)  ;
        int sum1 = arrayPairSum(nums1)  ;
        System.out.println(sum ); //9
        System.out.println(sum1 );//4
        /* 9 */

    }
}