import java.util.Arrays;

public class ArrayPartition {
     static int arrayPairSum(int[] nums) {
        int sum = 0 ;
        Arrays.sort(nums) ;
        for(int  i = 0 ; i < nums.length ; i+= 2 ){
            sum  = sum + nums[i] ;
        }
        return sum ; 
    }
    public static void main(String[] args) {
        int[] nums= {1,4,3,2} ;
        System.out.println(arrayPairSum(nums));
    }
}
