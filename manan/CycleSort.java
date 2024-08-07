// when given numbers from range 1,N => use cyclic sort
// index of a particular element = particular element-1
// worst case = O(N)
package manan;
import java.util.Arrays;
public class CycleSort {
    public static void main(String args[]){
int [] arr = {3,5,2,1,4};
cycleSort(arr);
System.out.println(Arrays.toString(arr));
    }
    static void cycleSort(int [] arr){
        int n = arr.length;
        int i=0;
        while(i<n){
            int x = arr[i]-1;
            if(arr[i]!=arr[x]){
              swap(arr,i,x);
            }else{
                i++;
            }
        }
    }
    static void swap(int [] arr,int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

}
