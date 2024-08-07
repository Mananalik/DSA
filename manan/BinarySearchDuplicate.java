package manan;

public class BinarySearchDuplicate {
    public static void main(String args[]){

    }
    static int search(int [] arr , int target){
        int pivot = findPivotWithDuplicates(arr);
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
    static int findPivotWithDuplicates(int [] arr){
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[s] && arr[mid]==arr[e]){
                if(arr[s] > arr[s+1]){
                    return s;
                }
                s++;
                if(arr[e]<arr[e-1]){
                    return e-1;

                }
                e--;
            }
            else if(arr[s]<arr[mid] || arr[s]==arr[mid] && arr[mid]>arr[e]){
                s=  mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }
}
