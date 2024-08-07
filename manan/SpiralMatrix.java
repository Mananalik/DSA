package manan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        generateMatrix(3);
        System.out.println(Arrays.toString(matrix));
        int matrix1[][] = new int [3][3];
    }

//        static List<Integer> spiralOrder(int[][] matrix) {
//            List <Integer> list = new ArrayList<Integer>();
//            if(matrix.length==0){
//                return list;
//            }
//            int rowBegin=0;
//            int rowEnd=matrix.length-1;
//            int colBegin=0;
//            int colEnd = matrix[0].length-1;
//            while (rowBegin <= rowEnd && colBegin <= colEnd) {
//                for (int j = colBegin; j <= colEnd; j++) {
//                    list.add(matrix[rowBegin][j]);
//                }
//                rowBegin++;
//                for (int j = rowBegin; j <= rowEnd; j++) {
//                    list.add(matrix[j][colEnd]);
//                }
//                colEnd--;
//                if (rowBegin <= rowEnd) {
//                    for (int j = colEnd; j >= colBegin; j--) {
//                        list.add(matrix[rowEnd][j]);
//                    }
//                }
//                rowEnd--;
//                if (colBegin <= colEnd) {
//                    for (int j = rowEnd; j >= rowBegin; j--) {
//                        list.add(matrix[j][colBegin]);
//                    }
//                }
//                colBegin++;
//            }
//            return list;
//        }

    static int[][] generateMatrix(int n) {
        int [][] matrix = new int [n][n];
        if(n==0){
            return matrix;
        }
        int rowBegin=0;
        int rowEnd = n-1;
        int colBegin=0;
        int colEnd=n-1;
        int sum=1;
        while(rowBegin<=rowEnd && colBegin<=colEnd && sum<=n*n){
            for(int j=colBegin; j<=colEnd;j++){
                matrix[rowBegin][j]=sum++;
            }
            rowBegin++;
            for(int j=rowBegin;j<=rowEnd;j++){
                matrix[j][colEnd]=sum++;
            }
            colEnd--;
            if(rowBegin<=rowEnd){
                for (int j = colEnd; j >= colBegin; j--) {
                    matrix[rowEnd][j]=sum++;
                }
            }
            rowEnd--;
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--) {
                    matrix[j][colBegin]=sum++;
                }
            }
            colBegin++;
        }
        return matrix;
    }
}


