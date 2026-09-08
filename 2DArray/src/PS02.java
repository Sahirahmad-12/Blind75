//Rotate image or matrix by 90
//
//public class PS02 {
//    public void rotate90Clockwise(int[][] matrix, int N){
//        //step1: transpose of matrix
//        //swap matrix[i][j], matrix[j][i]
//        for(int i=0; i<N; i++){
//            for(int j = 0; j<N; j++){
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//        //step2: reverse all rows of matrix
//        //har row pr jana hai and reverse use krna hai
//        for(int row = 0; row<N; row++){
//            //ab mai ek nayi row pa aa gya, ab reverse krunga
//            int startCol = 0;
//            int endCol = N-1;
//            while (startCol <= endCol){
//                int temp = matrix[row][startCol];
//                matrix[row][startCol] = matrix[row][endCol];
//                matrix[row][endCol] = temp;
//                startCol++;
//                endCol--;
//            }
//        }
//    }
//    public static void main(String[] args) {
//    }
//}

//Spiral Print a Matrix

import java.util.ArrayList;
import java.util.List;

public class PS02 {

    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int startingRow = 0;
        int endingRow = m - 1;

        int startingCol = 0;
        int endingCol = n - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {

            // Row wise left to right
            for (int col = startingCol; col <= endingCol; col++) {
                result.add(matrix[startingRow][col]);
            }
            startingRow++;

            // Column wise top to bottom
            for (int row = startingRow; row <= endingRow; row++) {
                result.add(matrix[row][endingCol]);
            }
            endingCol--;

            // Row wise right to left
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    result.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            // Column wise bottom to top
            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}