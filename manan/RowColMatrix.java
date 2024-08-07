package manan;
import java.util.Arrays;
public class RowColMatrix {
     public static void main(String args[]){
         int matrix[][] = {{1,3}};

         int target = 3;
         System.out.println(Arrays.toString(search(matrix,target)));
     }
     static int [] search(int [][] matrix , int target){
         int r =0;
         int c = matrix.length - 1;
         while(r<matrix.length && c>=0){
             if(matrix[r][c]==target){
                 return new int [] {r,c};
             }
             else if(matrix[r][c]>target){
                 c--;
             }
             else{
                 r++;
             }
         }
         return new int []{-1,-1};
     }
}
