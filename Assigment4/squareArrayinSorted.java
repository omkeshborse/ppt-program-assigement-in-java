
import java.util.Arrays;

public class squareArrayinSorted {
    static void squares(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i] ;
        }
        Arrays.sort(nums);

    }
    public static void main(String[] args) {
        int[] nums ={-4,-1,0,3,10} ;
        squares(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
