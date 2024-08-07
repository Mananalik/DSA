package manan;

public class Binarysearchcode {
    public static void main(String args[]){
        int [] arr = {1,13,15,45,50,58,64,96,121};
        int target = 64;
        System.out.println(binarySearch(arr,target));

    }
    static int binarySearch(int[]arr,int target){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(target<arr[mid]){
                e = mid - 1;
            }
           else if(target>arr[mid]){
                s = mid + 1;
            }
            else{
               return mid;
            }
        }
        return -1;
    }




}
