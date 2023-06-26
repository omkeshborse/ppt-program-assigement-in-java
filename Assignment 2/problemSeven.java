/* note omkesh  in any example of comparsino  of adjecent nums take array traverse 0 to  nums.length-1  */
public class problemSeven {
    static boolean isMonotonic(int[] nums ){
        boolean is_incresing = true ;
        boolean is_decresing = true ;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]< nums[i+1]) {
                is_incresing = false ;
            }
            if (nums[i] > nums[i+1]) {
                is_decresing = false ;
            }
        }

        return is_decresing||is_incresing ;
    }
    public static void main(String[] args) {
        int[] nums = { 1,2,2,3} ;
        int[] nums1  = {6,5,4,4 } ;
        int[] nums2 = { 1,3,2} ;
        System.out.println(isMonotonic(nums));
        System.out.println(isMonotonic(nums1));
        System.out.println(isMonotonic(nums2));
    }
}
