public class Transposeofmatrix {
    static void  transpose(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i] ;
                arr[j][i] = temp ;
            }
        }

    }
    public static void main(String[] args) {
      int[][] matrix =  {{1,2,3},{4,5,6},{7,8,9}} ;
      transpose(matrix);
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            System.out.print(matrix[i][j]);
        }
        System.out.println();
      }
    }
}
