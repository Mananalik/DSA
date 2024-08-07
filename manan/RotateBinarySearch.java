package manan;

public class RotateBinarySearch {
    public static void main(String [] args){
        int [] arr = {4,5,6,7,0,2};
         int target = 0;
         System.out.println(search(arr,target));
    }
    static int search(int [] arr , int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        else if(target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        else{
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }
    }
    static int binarySearch(int[]arr,int target , int s , int e){

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
    static int findPivot(int [] arr){
        int s=0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid >s&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[s]){
                e = mid-1;
            }
            else{
                s = mid+ 1;
            }
        }
        return -1;
    }
}
