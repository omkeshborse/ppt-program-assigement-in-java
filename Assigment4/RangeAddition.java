public class RangeAddition {
     public static int maxCount(int m, int n, int[][] ops) {
        int r = m ,c = n ;
        for(int  i = 0 ; i< ops.length ;i++){
            r = Math.min(r, ops[i][0]) ;
            c= Math.min(c ,ops[i][1] ) ;
        }
        return r*c; 
    } 
    public static void main(String[] args) {
        int[][] ops ={{2,2} ,{3,3}} ;
        int result = maxCount(3,3 ,ops) ;
        System.out.println(result); 
    }
}
