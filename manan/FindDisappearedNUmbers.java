package manan;
import java.util.Arrays;
public class FindDisappearedNUmbers {
    public static void main(String args[]){
        int arr[] = {1,1};
//         int arr[] = {1,2,2,3,3,4,7,8};
         cycleSort(arr);
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
        for(int j=0;j<arr.length;j++){
            int x = j+1;
            if(arr[j]!=x){
               System.out.println(x);
            }
        }
    }
    static void swap(int [] arr,int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
