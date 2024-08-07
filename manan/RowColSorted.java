package manan;
import java.util.Arrays;
public class RowColSorted {
    public static void main(String args[]){
        int matrix[][] = {{1,3}};
        int target = 3;
        System.out.println(Arrays.toString(search(matrix,target)));
    }
    // binary search in a row regarding what are you searching and in which range
    static int [] binarySearch(int[][] matrix,int r , int cs , int ce , int target){
        while(cs<=ce){
            int mid = cs + (cs-ce)/2;
            if(matrix[r][mid]==target){
                return new int[]{r,mid};
            }
            else if(matrix[r][mid]<target){
                cs = mid+1;
            }else{
                ce = mid-1;
            }
        }
        return new int[] {-1,-1};
    }

    static int [] search(int [][] matrix , int target){
        int r =matrix.length;
        int c = matrix[0].length ; // be cautious matrix may be empty
        if(r==1){
             return binarySearch(matrix,0,0,c-1,target);
        }
        int rs =0;
        int re = r-1;
        int cmid = c/2;
        // run the loop till two rows are remaining
        while(rs<=(re-1)){// while this is true it is having more than two rows
            int mid = rs+(re-rs)/2;
            if(matrix[mid][cmid]==target){
               return new int []{mid,cmid};
            }else if(matrix[mid][cmid]<target){
                rs = mid;
            }else{
                re = mid;
            }
            // now we have two rows
            // check weather the target is in the col of 2 rows
            if(matrix[rs][cmid]==target){
                return new int [] {rs,cmid};
            }
            if(matrix[rs+1][cmid]==target){
                return new int [] {rs+1,cmid};
            }
            // search in 1st half
            if(target<=matrix[rs][cmid-1]){
                return binarySearch(matrix,rs,0,cmid-1,target);

            }
            // search in second half
            if(target>=matrix[rs][cmid+1]){
                return binarySearch(matrix,rs,cmid+1,c-1,target);
            }
            // search in 3rd half
            if(target<=matrix[rs+1][cmid-1]){
                return binarySearch(matrix,rs+1,0,cmid-1,target);
            }
            // saerch in 4th half
            else{
                return binarySearch(matrix,rs+1,cmid+1,c-1,target);
            }
        }
        return new int []{-1,-1};
    }
}

