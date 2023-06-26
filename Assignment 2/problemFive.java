import java.util.Arrays;

public class problemFive {
    static  int maximumProduct(int[] nums) {
        int n = nums.length ;
        Arrays.sort(nums) ;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3] , nums[0]*nums[1]*nums[n-1]) ;
    }
    public static void main(String[] args) {
       int[] nums = {1,2,3} ;
       int[] nums1 = {-1,-2,-3} ;
       int result = maximumProduct(nums) ;
       int result1 = maximumProduct(nums1) ;
       System.out.println(result);
       System.out.println(result1);
    }
}
