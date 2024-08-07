// worst case = O(N^2)
// best case = O(N)
// why do we use it?
// Adaptive : steps get reduced if array is sorted. No of swaps gets reduced as compared to bubble sort
// stable
// used for smaller values of N , works well when array is partially sorted
// it takes part in hybrid sorting algorithms
package manan;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String args[]){
     int [] arr = {5,3,4,1,2};
     insertion(arr);
     System.out.println(Arrays.toString(arr));
    }
    static void insertion(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap (int arr[] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
