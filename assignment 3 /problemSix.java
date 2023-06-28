class problemSix {
     static  int singleNumber(int[] nums) {
        for(int  i = 0 ; i < nums.length-1 ; i++){
            for(int j = i+1 ; j<nums.length ; j++ ){
                if(nums[i]==nums[j]){
                    nums[i]=-nums[i] ;
                    nums[j]= -nums[j] ;
                }
            }
        }
        for(int i = 0 ;i<nums.length ;i++ ){
            if(nums[i] > 0 ){
                return nums[i] ;
            }
        }
        return 0 ;
    }
  public static void main(String[] args) {
		int[] nums = {2,2,1 } ;
    System.out.println(singleNumber(singleNumber)) ;
 	}
}
