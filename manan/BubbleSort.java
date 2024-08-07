// also known as sinking sort and exchange sort or inplace sorting algorithms
// space complexity=0(1)
// Time complexity worst case = O(N^2)
                 //  best case = O(N)
// Stable = Yes
package manan;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String args[]){
     int [] arr = {5,3,1,4,2};
     bubble(arr);
     System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){
        boolean swapped;
        // run the step n-1 times
        for(int i=0;i<arr.length;i++) {// Here i is a counter
            // for each step max item will come at the last respective index
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i , it means the array is sorted and hence stop the program
            if(!swapped){//!false=true
                break;
            }
        }
    }

}
