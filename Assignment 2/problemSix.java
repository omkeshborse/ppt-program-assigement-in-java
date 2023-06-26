public class problemSix {
    static int findTarget(int[] nums ,int target ){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) {
                return i ;
                
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12} ;
        int  index = findTarget(nums, 9) ;
        System.out.println(index);
    }
}
