//Print the sum of each row in 2D Array

//import java.util.ArrayList;
//import java.util.List;
//
//public class PS01 {
//    public List<Integer> rowSum(int[][] arr){
//        //Implement logic
//        List<Integer> result = new ArrayList<>();
//
//        int m = arr.length;
//        int n = arr[0].length;
//
//        //Traversal
//        for(int row = 0; row<n; row++){
//            int sum = 0;
//            for(int col = 0; col<n; col++){
//                int value = arr[row][col];
//                sum = sum + value;
//            }
//            result.add(sum);
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//
//    }
//}


//Print the sum of each column in 2D Array

//import java.util.ArrayList;
//import java.util.List;
//
//public class PS01 {
//
//    public List<Integer> wavePrintMatrix(int[][] matrix, int m, int n) {
//
//        List<Integer> result = new ArrayList<>();
//
//        // Move column wise
//        for (int col = 0; col < n; col++) {
//
//            // Check odd/even column
//            if ((col & 1) == 1) {
//
//                // Odd column -> bottom to top
//                for (int row = m - 1; row >= 0; row--) {
//                    result.add(matrix[row][col]);
//                }
//
//            } else {
//
//                // Even column -> top to bottom
//                for (int row = 0; row < m; row++) {
//                    result.add(matrix[row][col]);
//                }
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}


//Transpose of a Matrix

public class PS01 {
    public int[][] transpose(int[][] matrix){
        if(matrix == null || matrix.length == 0){
            return new int[0][0];
        }
        //original array
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        //for new array
        int newTotalRows = totalCols;
        int newTotalCols = totalRows;
        int ans[][] = new int[newTotalRows][newTotalCols];

        //logic
        for(int i = 0; i<totalRows; i++){
            for(int j = 0; j<totalCols; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    }
}