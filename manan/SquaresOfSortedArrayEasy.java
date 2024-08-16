package manan;
import java.util.*;
public class SquaresOfSortedArrayEasy {
    public static void main(String[] args) {
        int arr[] = {2,-3,4,5,6};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    static int[] sortedSquares(int[] nums) {
        int arr[] = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
