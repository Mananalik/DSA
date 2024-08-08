package manan;
import java.util.Arrays;
public class Matrixmedium {
    public static void main(String[] args) {
        int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }


    static void setZeroes(int[][] matrix) {
        // Brute force
//        int rowEnd = matrix.length-1;
//        int colEnd = matrix[0].length-1;
//        int [][] arr = new int [rowEnd+1][colEnd+1];
//        for(int i=0;i<=rowEnd;i++){
//            for(int j=0;j<=colEnd;j++){
//                arr[i][j]=matrix[i][j];
//            }
//        }
//        for(int i=0;i<=rowEnd;i++) {
//            for (int j = 0; j <= colEnd; j++) {
//                if (matrix[i][j] == 0) {
//                    for (int x = 0; x <= colEnd; x++) {
//                        arr[i][x] = 0;
//                    }
//                    for (int y = 0; y <= rowEnd; y++) {
//                        arr[y][j] = 0;
//                    }
//                }
//            }
//        }
//        for(int i=0;i<=rowEnd;i++){
//            for(int j=0;j<=colEnd;j++){
//                System.out.print(arr[i][j]);
//            }
//        }
//    }



            int m=matrix.length, n=matrix[0].length;
            int rowsArray[]= new int[m];
            int colsArray[]= new int[n];

            Arrays.fill(rowsArray,1);
            Arrays.fill(colsArray,1);

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==0){
                        rowsArray[i]=0;
                        colsArray[j]=0;
                    }
                }
            }

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(rowsArray[i]==0 || colsArray[j]==0)
                        matrix[i][j]=0;
                }
            }
        }

    }


